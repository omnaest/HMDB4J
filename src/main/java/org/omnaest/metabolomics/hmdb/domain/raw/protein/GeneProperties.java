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

@XmlAccessorType(XmlAccessType.NONE)
public class GeneProperties
{
	@XmlElement(name = "chromosome_location")
	private String chromosomeLocation;

	@XmlElement
	private String locus;

	@XmlElement(name = "gene_sequence")
	private String geneSequence;

	public String getChromosomeLocation()
	{
		return chromosomeLocation;
	}

	public void setChromosomeLocation(String chromosomeLocation)
	{
		this.chromosomeLocation = chromosomeLocation;
	}

	public String getLocus()
	{
		return locus;
	}

	public void setLocus(String locus)
	{
		this.locus = locus;
	}

	public String getGeneSequence()
	{
		return geneSequence;
	}

	public void setGeneSequence(String geneSequence)
	{
		this.geneSequence = geneSequence;
	}

}
