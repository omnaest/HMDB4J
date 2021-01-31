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

import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import org.omnaest.metabolomics.hmdb.domain.raw.base.Reference;
import org.omnaest.metabolomics.hmdb.domain.raw.base.References;

@XmlAccessorType(XmlAccessType.NONE)
public class Disease
{
	@XmlElement
	private String name;

	@XmlElement(name = "omim_id")
	private String omimId;

	@XmlElement(name = "references")
	private References references;

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getOmimId()
	{
		return this.omimId;
	}

	public void setOmimId(String omimId)
	{
		this.omimId = omimId;
	}

	public List<Reference> getReferences()
	{
		return this.references != null ? this.references.getReferences() : Collections.emptyList();
	}

	public void setReferences(List<Reference> references)
	{
		this.references = new References().setReferences(references);
	}

}