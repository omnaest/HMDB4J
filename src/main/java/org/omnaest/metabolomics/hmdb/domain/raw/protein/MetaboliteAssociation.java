package org.omnaest.metabolomics.hmdb.domain.raw.protein;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class MetaboliteAssociation
{
	@XmlElement
	private Accession accession;

	@XmlElement
	private String name;

	public Accession getAccession()
	{
		return accession;
	}

	public void setAccession(Accession accession)
	{
		this.accession = accession;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
