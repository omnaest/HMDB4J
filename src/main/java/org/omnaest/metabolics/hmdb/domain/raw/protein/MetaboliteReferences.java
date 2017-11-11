package org.omnaest.metabolics.hmdb.domain.raw.protein;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class MetaboliteReferences
{
	@XmlElement(name = "metabolite_reference")
	private List<MetaboliteReference> metabolicReferences;

	public List<MetaboliteReference> getMetabolicReferences()
	{
		return metabolicReferences;
	}

	public void setMetabolicReferences(List<MetaboliteReference> metabolicReferences)
	{
		this.metabolicReferences = metabolicReferences;
	}

}
