package org.omnaest.metabolics.hmdb.domain.protein;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class ProteinProperties
{
	@XmlElement(name = "residue_number")
	private String residueNumber;

	@XmlElement(name = "molecular_weight")
	private String molecularWeight;

	@XmlElement(name = "theoretical_pi")
	private String theoreticalPi;

	@XmlElement
	private Pfams pfams;

	//transmembrane_regions

	//signal_regions

	@XmlElement(name = "polypeptide_sequence")
	private String polypeptideSequence;

	public String getResidueNumber()
	{
		return residueNumber;
	}

	public void setResidueNumber(String residueNumber)
	{
		this.residueNumber = residueNumber;
	}

	public String getMolecularWeight()
	{
		return molecularWeight;
	}

	public void setMolecularWeight(String molecularWeight)
	{
		this.molecularWeight = molecularWeight;
	}

	public String getTheoreticalPi()
	{
		return theoreticalPi;
	}

	public void setTheoreticalPi(String theoreticalPi)
	{
		this.theoreticalPi = theoreticalPi;
	}

	public Pfams getPfams()
	{
		return pfams;
	}

	public void setPfams(Pfams pfams)
	{
		this.pfams = pfams;
	}

	public String getPolypeptideSequence()
	{
		return polypeptideSequence;
	}

	public void setPolypeptideSequence(String polypeptideSequence)
	{
		this.polypeptideSequence = polypeptideSequence;
	}

}
