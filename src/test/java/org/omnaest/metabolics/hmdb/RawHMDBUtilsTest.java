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
package org.omnaest.metabolics.hmdb;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Ignore;
import org.junit.Test;
import org.omnaest.metabolics.hmdb.components.MetaboliteAnalysis;
import org.omnaest.metabolics.hmdb.domain.raw.metabolite.HMDBRawMetaboliteDataSet;
import org.omnaest.metabolics.hmdb.domain.raw.metabolite.Metabolite;
import org.omnaest.metabolics.hmdb.domain.raw.protein.HMDBProteinModel;
import org.omnaest.metabolics.hmdb.utils.JSONHelper;
import org.omnaest.metabolics.hmdb.utils.XMLHelper;

public class RawHMDBUtilsTest
{

	@Test
	@Ignore
	public void testParseMetaboliteXMLAndMore() throws Exception
	{
		File file = new File("C:\\Z\\databases\\hmdb\\urine_metabolites.xml");
		String content = FileUtils.readFileToString(file, "utf-8");

		HMDBRawMetaboliteDataSet hmdbModel = RawHMDBUtils.parseMetaboliteXML(content);
		List<MetaboliteAnalysis> analysis = hmdbModel	.getMetabolites()
														.stream()
														.limit(100)
														.map(metabolite -> new MetaboliteAnalysis(metabolite))
														.collect(Collectors.toList());

		System.out.println(JSONHelper.prettyPrint(analysis));
	}

	@Test
	@Ignore
	public void testParseMetaboliteXML() throws Exception
	{
		File file = new File("C:\\Z\\databases\\hmdb\\urine_metabolites.xml");

		String content = FileUtils.readFileToString(file, "utf-8");
		//		FileUtils	.readLines(file, "utf-8")
		//					.stream()
		//					.limit(2000)
		//					.forEach(System.out::println);

		HMDBRawMetaboliteDataSet hmdbModel = RawHMDBUtils.parseMetaboliteXML(content);
		System.out.println(JSONHelper.prettyPrint(hmdbModel	.getMetabolites()
															.stream()
															.limit(1)
															.collect(Collectors.toList())));
	}

	@Test
	@Ignore
	public void testParseProteinXML() throws Exception
	{
		File file = new File("C:\\Z\\databases\\hmdb\\hmdb_proteins.xml");
		//		File file = new File("C:\\Z\\databases\\hmdb\\sample\\protein_sample.xml");

		HMDBProteinModel hmdbModel = RawHMDBUtils.parseProteinXML(file);

		FileUtils.writeStringToFile(new File(file.getParent(), "hmdb_proteins.json"), JSONHelper.prettyPrint(hmdbModel), "utf-8");
		System.out.println(JSONHelper.prettyPrint(hmdbModel	.getProteins()
															.stream()
															.limit(10)
															.collect(Collectors.toList())));
	}

	@Test
	public void testParseProteinXML2() throws Exception
	{
		File file = new File("C:\\Z\\databases\\hmdb\\hmdb_proteins.xml");
		//		File file = new File("C:\\Z\\databases\\hmdb\\sample\\protein_sample.xml");

		HMDBProteinModel hmdbModel = RawHMDBUtils.parseProteinXML(file);

		hmdbModel	.getProteins()
					.stream()
					.filter(protein -> StringUtils.equalsIgnoreCase("Enzyme", protein.getProteinType()))
					.forEach(protein ->
					{
						System.out.println(protein.getGeneName() + " (" + protein.getGeneralFunction() + ")");
						//System.out.println(JSONHelper.prettyPrint(protein));
					});
	}

	@Test
	@Ignore
	public void testSerialize()
	{
		List<Metabolite> metabolites = new ArrayList<>();
		Metabolite metabolite = new Metabolite();
		metabolite.setSynonyms(Arrays.asList("aa", "aaa"));
		metabolites.add(metabolite);
		HMDBRawMetaboliteDataSet hmdbModel = new HMDBRawMetaboliteDataSet();
		hmdbModel.setMetabolites(metabolites);

		System.out.println(XMLHelper.serialize(hmdbModel));

	}

}
