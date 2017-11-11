package org.omnaest.metabolics.hmdb.domain.raw.protein;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class Pfam
{
	@XmlElement
	private String name;

	@XmlElement(name = "pfam_id")
	private String pfamId;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPfamId()
	{
		return pfamId;
	}

	public void setPfamId(String pfamId)
	{
		this.pfamId = pfamId;
	}

}
