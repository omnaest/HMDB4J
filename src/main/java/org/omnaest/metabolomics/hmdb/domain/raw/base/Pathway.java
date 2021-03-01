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
package org.omnaest.metabolomics.hmdb.domain.raw.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.NONE)
public class Pathway
{
	@XmlElement
	private String name;

	@XmlElement(name = "smpdb_id")
	private String smpdbId;

	@XmlElement(name = "kegg_map_id")
	private String keggMapId;

	public String getKeggMapId()
	{
		return this.keggMapId;
	}

	public void setKeggMapId(String keggMapId)
	{
		this.keggMapId = keggMapId;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSmpdbId()
	{
		return this.smpdbId;
	}

	public void setSmpdbId(String smpdbId)
	{
		this.smpdbId = smpdbId;
	}

}
