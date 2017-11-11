package org.omnaest.metabolics.hmdb.domain.raw.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class Reference
{
	@XmlElement(name = "reference_text")
	private String text;

	@XmlElement(name = "pubmed_id")
	private String pubmedId;

	public String getPubmedId()
	{
		return this.pubmedId;
	}

	public void setPubmedId(String pubmedId)
	{
		this.pubmedId = pubmedId;
	}

	public String getText()
	{
		return this.text;
	}

	public void setText(String text)
	{
		this.text = text;
	}

}