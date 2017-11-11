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
package org.omnaest.metabolics.hmdb.components;

import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.junit.Test;

public class MetaboliteAnalysisTest
{
	@Test
	public void test()
	{
		assertTrue(Pattern	.compile("([0-9\\.]+)[ ]*\\(([0-9\\.]+)[ ]*\\-[ ]*([0-9\\.]+)\\)")
							.matcher("48.0 (0.00-200.0)")
							.matches());
	}
}
