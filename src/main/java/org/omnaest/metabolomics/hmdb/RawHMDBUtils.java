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

import org.apache.commons.io.FileUtils;
import org.omnaest.metabolomics.hmdb.domain.raw.metabolite.HMDBRawMetaboliteDataSet;
import org.omnaest.metabolomics.hmdb.domain.raw.protein.HMDBProteinModel;
import org.omnaest.metabolomics.hmdb.utils.XMLHelper;

public class RawHMDBUtils
{
	public static HMDBRawMetaboliteDataSet parseMetaboliteXML(File file) throws IOException
	{
		return parseMetaboliteXML(FileUtils.readFileToString(file, "utf-8"));
	}

	public static HMDBRawMetaboliteDataSet parseMetaboliteXML(String xml)
	{
		return XMLHelper.parse(xml, HMDBRawMetaboliteDataSet.class);
	}

	public static HMDBProteinModel parseProteinXML(File file) throws IOException
	{
		return parseProteinXML(FileUtils.readFileToString(file, "utf-8"));
	}

	public static HMDBProteinModel parseProteinXML(String xml)
	{
		return XMLHelper.parse(xml, HMDBProteinModel.class);
	}
}
