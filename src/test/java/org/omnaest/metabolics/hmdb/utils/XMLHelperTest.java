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
package org.omnaest.metabolics.hmdb.utils;

import static org.junit.Assert.assertEquals;

import javax.xml.bind.annotation.XmlRootElement;

import org.junit.Test;

public class XMLHelperTest
{

	@XmlRootElement
	public static class Domain
	{
		private String value;

		public String getValue()
		{
			return this.value;
		}

		public void setValue(String value)
		{
			this.value = value;
		}

	}

	@Test
	public void testClone() throws Exception
	{
		Domain model = new Domain();
		model.setValue("123");

		Domain clone = XMLHelper.clone(model);
		assertEquals("123", clone.getValue());
	}

}
