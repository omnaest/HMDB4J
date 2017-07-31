package org.omnaest.metabolics.hmdb.domain.protein;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class Pfams
{
	@XmlElement(name = "pfam")
	private List<Pfam> pfams;

	public List<Pfam> getPfams()
	{
		return pfams;
	}

	public void setPfams(List<Pfam> pfams)
	{
		this.pfams = pfams;
	}

}
