package org.omnaest.metabolics.hmdb.domain.protein;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class Proteins
{
	@XmlElement(name = "protein")
	private List<Protein> proteins;

	public List<Protein> getProteins()
	{
		return proteins;
	}

	public void setProteins(List<Protein> proteins)
	{
		this.proteins = proteins;
	}

}
