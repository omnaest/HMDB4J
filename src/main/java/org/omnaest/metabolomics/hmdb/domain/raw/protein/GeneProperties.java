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
