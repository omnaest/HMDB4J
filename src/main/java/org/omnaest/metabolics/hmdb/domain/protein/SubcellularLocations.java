package org.omnaest.metabolics.hmdb.domain.protein;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class SubcellularLocations
{
	@XmlElement(name = "subcellular_location")
	private List<SubcellularLocation> subcellularLocations;

	public List<SubcellularLocation> getSubcellularLocations()
	{
		return subcellularLocations;
	}

	public void setSubcellularLocations(List<SubcellularLocation> subcellularLocations)
	{
		this.subcellularLocations = subcellularLocations;
	}

}
