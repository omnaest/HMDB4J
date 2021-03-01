/*******************************************************************************
 * Copyright 2021 Danny Kunz
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
/*

	Copyright 2017 Danny Kunz

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.


*/
package org.omnaest.metabolomics.hmdb.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.omnaest.metabolomics.hmdb.domain.raw.metabolite.Concentration;
import org.omnaest.metabolomics.hmdb.domain.raw.metabolite.Metabolite;
import org.omnaest.utils.PatternUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@XmlAccessorType(XmlAccessType.FIELD)
public class MetaboliteAnalysis
{
	private static final Logger LOG = LoggerFactory.getLogger(MetaboliteAnalysis.class);

	private String																	keggId;
	private Map<MetaboliteAnalysis.FluidType, List<MetaboliteAnalysis.MeasureSpot>>	normalMeasurements;
	private Map<MetaboliteAnalysis.FluidType, List<MetaboliteAnalysis.MeasureSpot>>	abnormalMeasurements;
	private Map<FluidType, MeasurementRange>										normalValueRange;

	@XmlAccessorType(XmlAccessType.FIELD)
	public static class MeasurementRange
	{
		private double	average;
		private double	min;
		private double	max;
		private int		count;
		private double	deviation;

		public MeasurementRange(double average, double min, double max, int count, double deviation)
		{
			super();
			this.average = average;
			this.min = min;
			this.max = max;
			this.count = count;
			this.deviation = deviation;
		}

		public double getDeviation()
		{
			return this.deviation;
		}

		public double getAverage()
		{
			return this.average;
		}

		public double getMin()
		{
			return this.min;
		}

		public double getMax()
		{
			return this.max;
		}

		public int getCount()
		{
			return this.count;
		}

		@Override
		public String toString()
		{
			return "MeasurementRange [average=" + this.average + ", min=" + this.min + ", max=" + this.max + ", count=" + this.count + "]";
		}

	}

	public enum FluidType
	{
		Blood,
		Urine,
		Saliva,
		Feces,
		BreastMilk("Breast Milk"),
		Sweat,
		CSF("Cerebrospinal Fluid (CSF)"),
		Bile,
		AmnioticFluid("Amniotic fluid"),
		Cytoplasm("Cellular cytoplasm"),
		Other;

		private String label;

		private FluidType()
		{
		}

		private FluidType(String label)
		{
			this.label = label;
		}

		public String getLabel()
		{
			return this.label != null ? this.label : this.name();
		}

		public static MetaboliteAnalysis.FluidType matchByLabel(String label)
		{
			return Arrays	.asList(values())
							.stream()
							.filter(type -> StringUtils.equalsIgnoreCase(label, type.getLabel()))
							.findFirst()
							.orElseGet(() ->
							{
								LOG.warn("Missing enum for body fluid: " + label);
								return Other;
							});
		}

		public static MetaboliteAnalysis.FluidType matchByName(String name)
		{
			return Arrays	.asList(values())
							.stream()
							.filter(type -> StringUtils.equalsIgnoreCase(name, type.name()))
							.findFirst()
							.orElseThrow(() -> new IllegalArgumentException("Unknown body fluid type: " + name));
		}
	}

	protected static class MeasureSpot
	{
		private double	value;
		private double	deviation;

		public MeasureSpot(double value, double deviation)
		{
			super();
			this.value = value;
			this.deviation = deviation;
		}

		public double getValue()
		{
			return this.value;
		}

		public double getDeviation()
		{
			return this.deviation;
		}

		@Override
		public String toString()
		{
			return "MeasureSpots [value=" + this.value + ", deviation=" + this.deviation + "]";
		}

	}

	public MetaboliteAnalysis(Metabolite metabolite)
	{
		this.keggId = metabolite.getKeggId();
		this.normalMeasurements = this.calculateMeasurementSpots(metabolite.getNormalConcentrations());
		this.abnormalMeasurements = this.calculateMeasurementSpots(metabolite.getAbnormalConcentrations());

		this.normalValueRange = this.normalMeasurements	.entrySet()
														.stream()
														.collect(Collectors.toMap(entry -> entry.getKey(), entry -> this.calculateAverage(entry.getValue())));
	}

	private MeasurementRange calculateAverage(List<MeasureSpot> values)
	{
		double average = values	.stream()
								.mapToDouble(value -> value.getValue())
								.average()
								.orElse(Double.NaN);
		double min = values	.stream()
							.mapToDouble(value -> value.getValue())
							.min()
							.orElse(Double.NaN);
		double max = values	.stream()
							.mapToDouble(value -> value.getValue())
							.max()
							.orElse(Double.NaN);
		int count = values.size();

		double variance = values.stream()
								.mapToDouble(value -> Math.pow(value.getValue() - average, 2))
								.sum()
				/ (count - 1);
		double deviation = Math.sqrt(variance);

		return new MeasurementRange(average, min, max, count, deviation);
	}

	public Map<FluidType, MeasurementRange> getNormalValueRange()
	{
		return this.normalValueRange;
	}

	private Map<FluidType, List<MeasureSpot>> calculateMeasurementSpots(List<Concentration> concentrations)
	{
		Map<String, List<Concentration>> fluidToConcentrations = (concentrations == null ? Collections.<Concentration>emptyList() : concentrations)	.stream()
																																					.collect(Collectors.groupingBy(fluid -> fluid.getBiofluid()));

		Function<? super String, ? extends MeasureSpot> measurementStringToSpotFunction = measurementValueStr ->
		{
			MetaboliteAnalysis.MeasureSpot measureSpot = null;
			Map<Integer, Double> groupsWithDeviation = PatternUtils	.matchToGroups(Pattern.compile("([0-9\\.]+)[\\+\\-\\/ ]*([0-9\\.]*)"), measurementValueStr)
																	.entrySet()
																	.stream()
																	.collect(Collectors.toMap(	entry -> entry.getKey(),
																								entry -> NumberUtils.toDouble(entry.getValue(), 0.0)));

			//48.0 (0.00-200.0)
			Map<Integer, Double> groupsWithRanges = PatternUtils.matchToGroups(	Pattern.compile("([0-9\\.]+)[ ]*\\(([0-9\\.]+)[ ]*\\-[ ]*([0-9\\.]+)\\)"),
																				measurementValueStr)
																.entrySet()
																.stream()
																.collect(Collectors.toMap(	entry -> entry.getKey(),
																							entry -> NumberUtils.toDouble(entry.getValue(), 0.0)));

			if (!groupsWithDeviation.isEmpty())
			{
				double value = groupsWithDeviation.get(1);
				double deviation = groupsWithDeviation.getOrDefault(2, 0.0);
				measureSpot = new MeasureSpot(value, deviation);
			}
			else if (!groupsWithRanges.isEmpty())
			{
				double value = groupsWithRanges.get(1);
				double deviation = (groupsWithRanges.getOrDefault(3, 0.0) - groupsWithRanges.getOrDefault(2, 0.0)) / 2;
				measureSpot = new MeasureSpot(value, deviation);
			}
			else
			{
				LOG.warn("Wrong measurement format: " + measurementValueStr);
			}
			return measureSpot;
		};

		return fluidToConcentrations.entrySet()
									.stream()
									.collect(Collectors.toMap(entry -> FluidType.matchByLabel(entry.getKey()), fluidEntry -> fluidEntry	.getValue()
																																		.stream()
																																		.map(fluid -> fluid.getValue())
																																		.filter(value -> StringUtils.isNotBlank(value))
																																		.map(value -> StringUtils.trim(value))
																																		.map(measurementStringToSpotFunction)
																																		.filter(spot -> spot != null)
																																		.collect(Collectors.toList())));

	}

	@Override
	public String toString()
	{
		return "MetaboliteAnalyzer [normalMeasurements=" + this.normalMeasurements + ", abnormalMeasurements=" + this.abnormalMeasurements + ", keggId="
				+ this.keggId + "]";
	}

}
