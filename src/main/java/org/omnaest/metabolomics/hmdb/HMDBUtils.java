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
package org.omnaest.metabolomics.hmdb;

import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import org.omnaest.metabolomics.hmdb.components.MetaboliteAnalysis;
import org.omnaest.metabolomics.hmdb.domain.HMDBMetaboliteDataSet;
import org.omnaest.metabolomics.hmdb.domain.raw.metabolite.HMDBRawMetaboliteDataSet;
import org.omnaest.metabolomics.hmdb.domain.raw.metabolite.Metabolite;

public class HMDBUtils
{
	public static interface HMDBDataSetLoader
	{
		public HMDBMetaboliteDataSet loadMetabolitesFrom(File file) throws IOException;
	}

	public static HMDBDataSetLoader getInstance()
	{
		return new HMDBDataSetLoader()
		{
			@Override
			public HMDBMetaboliteDataSet loadMetabolitesFrom(File file) throws IOException
			{
				HMDBRawMetaboliteDataSet rawDataSet = RawHMDBUtils.parseMetaboliteXML(file);
				return new HMDBMetaboliteDataSet()
				{

					@Override
					public Stream<MetaboliteAnalyzer> getAnalyzableMetabolites()
					{
						return rawDataSet	.getMetabolites()
											.stream()
											.map(metabolite -> this.createMetaboliteAnalyzer(metabolite));
					}

					private MetaboliteAnalyzer createMetaboliteAnalyzer(Metabolite metabolite)
					{
						return new MetaboliteAnalyzer()
						{
							@Override
							public MetaboliteAnalysis analyze()
							{
								return new MetaboliteAnalysis(metabolite);
							}

							@Override
							public String getName()
							{
								return metabolite.getName();
							}

							@Override
							public String getKeggId()
							{
								return metabolite.getKeggId();
							}

							@Override
							public boolean matches(String regex)
							{
								Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

								return Stream	.concat(Stream.of(metabolite.getName()), metabolite	.getSynonyms()
																									.stream())
												.anyMatch(name -> pattern	.matcher(name)
																			.matches());
							}
						};
					}

				};
			}
		};
	}
}
