package org.omnaest.metabolics.hmdb.domain.protein;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.omnaest.metabolics.hmdb.domain.base.Reference;

@XmlType(name = "metabolite_reference")
@XmlAccessorType(XmlAccessType.NONE)
public class MetaboliteReference
{
	@XmlElement
	private MetaboliteAssociation metabolite;

	@XmlElement
	private Reference reference;

	public MetaboliteAssociation getMetabolite()
	{
		return metabolite;
	}

	public void setMetabolite(MetaboliteAssociation metabolite)
	{
		this.metabolite = metabolite;
	}

	public Reference getReference()
	{
		return reference;
	}

	public void setReference(Reference reference)
	{
		this.reference = reference;
	}

}
