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
package org.omnaest.metabolomics.hmdb.domain.raw.protein;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.omnaest.metabolomics.hmdb.domain.raw.base.Reference;

@XmlType(name = "metabolite_reference")
@XmlAccessorType(XmlAccessType.NONE)
public class MetaboliteReference
{
	@XmlElement
	private MetaboliteAssociation metabolite;

	@XmlElement
	private Reference reference;

	public MetaboliteAssociation getMetabolite()
	{
		return metabolite;
	}

	public void setMetabolite(MetaboliteAssociation metabolite)
	{
		this.metabolite = metabolite;
	}

	public Reference getReference()
	{
		return reference;
	}

	public void setReference(Reference reference)
	{
		this.reference = reference;
	}

}
