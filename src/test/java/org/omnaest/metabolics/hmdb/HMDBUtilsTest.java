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

import org.junit.Ignore;
import org.junit.Test;
import org.omnaest.metabolics.hmdb.domain.HMDBModel;
import org.omnaest.metabolics.hmdb.domain.Metabolite;
import org.omnaest.metabolics.hmdb.utils.JSONHelper;
import org.omnaest.metabolics.hmdb.utils.XMLHelper;

public class HMDBUtilsTest
{

	@Test
	//@Ignore
	public void testParse() throws Exception
	{
		File file = new File("M:\\Body odor research\\matabolite database\\urine_metabolites.xml");
		//		FileUtils	.readLines(file, "utf-8")
		//					.stream()
		//					.limit(2000)
		//					.forEach(System.out::println);

		HMDBModel hmdbModel = HMDBUtils.parse(file);
		System.out.println(JSONHelper.prettyPrint(hmdbModel	.getMetabolites()
															.stream()
															.limit(1)
															.collect(Collectors.toList())));
	}

	@Test
	@Ignore
	public void testSerialize()
	{
		List<Metabolite> metabolites = new ArrayList<>();
		Metabolite metabolite = new Metabolite();
		metabolite.setSynonyms(Arrays.asList("aa", "aaa"));
		metabolites.add(metabolite);
		HMDBModel hmdbModel = new HMDBModel();
		hmdbModel.setMetabolites(metabolites);

		System.out.println(XMLHelper.serialize(hmdbModel));

	}

}
