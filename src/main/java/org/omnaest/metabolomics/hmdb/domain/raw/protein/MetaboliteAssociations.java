package org.omnaest.metabolomics.hmdb.domain.raw.protein;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class MetaboliteAssociations
{
	@XmlElement(name = "metabolite")
	private List<MetaboliteAssociation> metaboliteAssociations;

	public List<MetaboliteAssociation> getMetaboliteAssociations()
	{
		return metaboliteAssociations;
	}

	public void setMetaboliteAssociations(List<MetaboliteAssociation> metaboliteAssociations)
	{
		this.metaboliteAssociations = metaboliteAssociations;
	}

}
