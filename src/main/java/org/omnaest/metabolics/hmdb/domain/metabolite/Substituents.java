package org.omnaest.metabolics.hmdb.domain.metabolite;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class Substituents
{
	@XmlElement(name = "substituent")
	private List<String> substituents = new ArrayList<>();

	public List<String> getSubstituents()
	{
		return this.substituents;
	}

	public Substituents setSubstituents(List<String> substituents)
	{
		this.substituents = substituents;
		return this;
	}

}