package org.omnaest.metabolomics.hmdb.domain.raw.protein;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class Accessions
{
	@XmlElement(name="accession")
	private List<Accession> accessions;

	public List<Accession> getAccessions()
	{
		return accessions;
	}

	public void setAccessions(List<Accession> accessions)
	{
		this.accessions = accessions;
	}

}
