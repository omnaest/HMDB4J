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
package org.omnaest.metabolomics.hmdb.domain.raw.metabolite;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "hmdb")
@XmlAccessorType(XmlAccessType.NONE)
public class HMDBRawMetaboliteDataSet
{
	@XmlElement(name = "metabolite")
	private List<Metabolite> metabolites;

	public List<Metabolite> getMetabolites()
	{
		return this.metabolites;
	}

	public void setMetabolites(List<Metabolite> metabolites)
	{
		this.metabolites = metabolites;
	}

}
