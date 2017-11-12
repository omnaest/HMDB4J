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

import org.junit.Test;
import org.omnaest.metabolics.hmdb.domain.HMDBMetaboliteDataSet;
import org.omnaest.metabolics.hmdb.utils.JSONHelper;

public class HMDBUtilsTest
{

	@Test
	public void testGetInstance() throws Exception
	{
		File file = new File("C:\\Z\\databases\\hmdb\\urine_metabolites.xml");
		HMDBMetaboliteDataSet metaboliteDataSet = HMDBUtils	.getInstance()
															.loadMetabolitesFrom(file);

		metaboliteDataSet	.getAnalyzableMetabolites()
							.filter(metabolite -> metabolite.matches("homovanillate"))
							.limit(10)
							.forEach(analyzer ->
							{
								System.out.println(JSONHelper.prettyPrint(analyzer.analyze()));
							});
	}

}
