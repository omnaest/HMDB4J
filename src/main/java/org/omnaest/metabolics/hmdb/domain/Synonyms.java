package org.omnaest.metabolics.hmdb.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class Synonyms
{
	@XmlElement(name = "synonym")
	private List<String> synonyms = new ArrayList<>();

	public List<String> getSynonyms()
	{
		return this.synonyms;
	}

	public Synonyms setSynonyms(List<String> synonyms)
	{
		this.synonyms = synonyms;
		return this;
	}
}