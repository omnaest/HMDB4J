package org.omnaest.metabolomics.hmdb.domain.raw.metabolite;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class SecondaryAccessions
{
	@XmlElement(name = "accession")
	private List<String> accessions = new ArrayList<>();

	public List<String> getAccessions()
	{
		return this.accessions;
	}

	public SecondaryAccessions setAccessions(List<String> accessions)
	{
		this.accessions = accessions;
		return this;
	}

}