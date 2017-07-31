package org.omnaest.metabolics.hmdb.domain.base;

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