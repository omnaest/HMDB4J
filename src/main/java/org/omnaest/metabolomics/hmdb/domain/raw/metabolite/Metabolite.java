/*******************************************************************************
 * Copyright 2021 Danny Kunz
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
/*

	Copyright 2017 Danny Kunz

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.


*/
package org.omnaest.metabolomics.hmdb.domain.raw.metabolite;

import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.omnaest.metabolomics.hmdb.domain.raw.base.Pathways;
import org.omnaest.metabolomics.hmdb.domain.raw.base.Reference;
import org.omnaest.metabolomics.hmdb.domain.raw.base.References;
import org.omnaest.metabolomics.hmdb.domain.raw.base.Synonyms;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Metabolite
{
	@XmlElement
	private String version;

	@XmlElement(name = "creation_date")
	private String creationDate;

	@XmlElement(name = "update_date")
	private String updateDate;

	@XmlElement
	private String accession;

	@XmlElement(name = "secondary_accessions")
	private SecondaryAccessions secondaryAccession;

	@XmlElement
	private String name;

	@XmlElement
	private String description;

	@XmlElement
	private Synonyms synonyms;

	@XmlElement(name = "chemical_formula")
	private String chemicalFormula;

	@XmlElement(name = "average_molecular_weight")
	private String averageMolecularWeight;

	@XmlElement(name = "monisotopic_molecular_weight")
	private String monisotopicMolecularWeigth;

	@XmlElement(name = "iupac_name")
	private String IUPACName;

	@XmlElement(name = "traditional_iupac")
	private String traditionalIUAPC;

	@XmlElement(name = "cas_registry_number")
	private String casRegistryNumber;

	@XmlElement(name = "smiles")
	private String smiles;

	@XmlElement(name = "inchi")
	private String inchi;

	@XmlElement(name = "inchikey")
	private String inchikey;

	@XmlElement(name = "drugbank_id")
	private String drugbankId;

	@XmlElement(name = "drugbank_metabolite_id")
	private String drugbankMetaboliteId;

	@XmlElement(name = "phenol_explorer_compound_id")
	private String phenolExplorerCompoundId;

	@XmlElement(name = "phenol_explorer_metabolite_id")
	private String phenolExplorerMetaboliteId;

	@XmlElement(name = "foodb_id")
	private String foodbId;

	@XmlElement(name = "knapsack_id")
	private String knapsackId;

	@XmlElement(name = "chemspider_id")
	private String chemspiderId;

	@XmlElement(name = "kegg_id")
	private String keggId;

	@XmlElement(name = "biocyc_id")
	private String biocycId;

	@XmlElement(name = "bigg_id")
	private String biggId;

	@XmlElement(name = "wikipidia")
	private String wikipedia;

	@XmlElement(name = "nugowiki")
	private String nugowiki;

	@XmlElement(name = "metagene")
	private String metagene;

	@XmlElement(name = "metlin_id")
	private String metlinId;

	@XmlElement(name = "pubchem_compound_id")
	private String pubchemCompoundId;

	@XmlElement(name = "het_id")
	private String hetId;

	@XmlElement(name = "chebi_id")
	private String chebiId;

	@XmlElement(name = "synthesis_reference")
	private String synthesisReference;

	@XmlElement
	private Pathways pathways;

	@XmlElement(name = "normal_concentrations")
	private Concentrations normalConcentrations;

	@XmlElement(name = "abnormal_concentrations")
	private Concentrations abnormalConcentrations;

	@XmlElement(name = "biofluid_locations")
	private BiofluidLocations biofluidLocations;

	@XmlElement(name = "tissue_locations")
	private TissueLocations tissueLocations;

	@XmlElement(name = "diseases")
	private Diseases diseases;

	@XmlElement(name = "substituents")
	private Substituents substituents;

	@XmlElement(name = "general_references")
	private References generalReferences;

	public String getDrugbankId()
	{
		return this.drugbankId;
	}

	public void setDrugbankId(String drugbankId)
	{
		this.drugbankId = drugbankId;
	}

	public String getDrugbankMetaboliteId()
	{
		return this.drugbankMetaboliteId;
	}

	public void setDrugbankMetaboliteId(String drugbankMetaboliteId)
	{
		this.drugbankMetaboliteId = drugbankMetaboliteId;
	}

	public String getPhenolExplorerCompoundId()
	{
		return this.phenolExplorerCompoundId;
	}

	public void setPhenolExplorerCompoundId(String phenolExplorerCompoundId)
	{
		this.phenolExplorerCompoundId = phenolExplorerCompoundId;
	}

	public String getPhenolExplorerMetaboliteId()
	{
		return this.phenolExplorerMetaboliteId;
	}

	public void setPhenolExplorerMetaboliteId(String phenolExplorerMetaboliteId)
	{
		this.phenolExplorerMetaboliteId = phenolExplorerMetaboliteId;
	}

	public String getFoodbId()
	{
		return this.foodbId;
	}

	public void setFoodbId(String foodbId)
	{
		this.foodbId = foodbId;
	}

	public String getKnapsackId()
	{
		return this.knapsackId;
	}

	public void setKnapsackId(String knapsackId)
	{
		this.knapsackId = knapsackId;
	}

	public String getChemspiderId()
	{
		return this.chemspiderId;
	}

	public void setChemspiderId(String chemspiderId)
	{
		this.chemspiderId = chemspiderId;
	}

	public String getKeggId()
	{
		return this.keggId;
	}

	public void setKeggId(String keggId)
	{
		this.keggId = keggId;
	}

	public String getBiocycId()
	{
		return this.biocycId;
	}

	public void setBiocycId(String biocycId)
	{
		this.biocycId = biocycId;
	}

	public String getBiggId()
	{
		return this.biggId;
	}

	public void setBiggId(String biggId)
	{
		this.biggId = biggId;
	}

	public String getWikipedia()
	{
		return this.wikipedia;
	}

	public void setWikipedia(String wikipedia)
	{
		this.wikipedia = wikipedia;
	}

	public String getNugowiki()
	{
		return this.nugowiki;
	}

	public void setNugowiki(String nugowiki)
	{
		this.nugowiki = nugowiki;
	}

	public String getMetagene()
	{
		return this.metagene;
	}

	public void setMetagene(String metagene)
	{
		this.metagene = metagene;
	}

	public String getMetlinId()
	{
		return this.metlinId;
	}

	public void setMetlinId(String metlinId)
	{
		this.metlinId = metlinId;
	}

	public String getPubchemCompoundId()
	{
		return this.pubchemCompoundId;
	}

	public void setPubchemCompoundId(String pubchemCompoundId)
	{
		this.pubchemCompoundId = pubchemCompoundId;
	}

	public String getHetId()
	{
		return this.hetId;
	}

	public void setHetId(String hetId)
	{
		this.hetId = hetId;
	}

	public String getChebiId()
	{
		return this.chebiId;
	}

	public void setChebiId(String chebiId)
	{
		this.chebiId = chebiId;
	}

	public String getSynthesisReference()
	{
		return this.synthesisReference;
	}

	public void setSynthesisReference(String synthesisReference)
	{
		this.synthesisReference = synthesisReference;
	}

	public List<Reference> getGeneralReferences()
	{
		return this.generalReferences != null ? this.generalReferences.getReferences() : Collections.emptyList();
	}

	public void setGeneralReferences(List<Reference> generalReferences)
	{
		this.generalReferences = new References().setReferences(generalReferences);
	}

	public List<String> getSubstituents()
	{
		return this.substituents != null ? this.substituents.getSubstituents() : Collections.emptyList();
	}

	public void setSubstituents(List<String> substituents)
	{
		this.substituents = new Substituents().setSubstituents(substituents);
	}

	public List<String> getBiofluidLocations()
	{
		return this.biofluidLocations != null ? this.biofluidLocations.getLocations() : Collections.emptyList();
	}

	public void setBiofluidLocations(List<String> biofluidLocations)
	{
		this.biofluidLocations = new BiofluidLocations().setLocations(biofluidLocations);
	}

	public List<String> getTissueLocations()
	{
		return this.tissueLocations != null ? this.tissueLocations.getLocations() : Collections.emptyList();
	}

	public void setTissueLocations(List<String> tissueLocations)
	{
		this.tissueLocations = new TissueLocations().setLocations(tissueLocations);
	}

	public List<Disease> getDiseases()
	{
		return this.diseases != null ? this.diseases.getDiseases() : Collections.emptyList();
	}

	public void setDiseases(List<Disease> diseases)
	{
		this.diseases = new Diseases().setDiseases(diseases);
	}

	public List<Concentration> getAbnormalConcentrations()
	{
		return this.abnormalConcentrations != null ? this.abnormalConcentrations.getConcentrations() : Collections.emptyList();
	}

	public void setAbnormalConcentrations(List<Concentration> abnormalConcentrations)
	{
		this.abnormalConcentrations = new Concentrations().setConcentrations(abnormalConcentrations);
		;
	}

	public Pathways getPathways()
	{
		return this.pathways;
	}

	public void setPathways(Pathways pathways)
	{
		this.pathways = pathways;
	}

	public List<Concentration> getNormalConcentrations()
	{
		return this.normalConcentrations != null ? this.normalConcentrations.getConcentrations() : Collections.emptyList();
	}

	public void setNormalConcentrations(List<Concentration> normalConcentrations)
	{
		this.normalConcentrations = new Concentrations().setConcentrations(normalConcentrations);
	}

	public List<String> getSynonyms()
	{
		return this.synonyms != null ? this.synonyms.getSynonyms() : Collections.emptyList();
	}

	public void setSynonyms(List<String> synonyms)
	{
		this.synonyms = new Synonyms().setSynonyms(synonyms);
	}

	public String getVersion()
	{
		return this.version;
	}

	public void setVersion(String version)
	{
		this.version = version;
	}

	public String getCreationDate()
	{
		return this.creationDate;
	}

	public void setCreationDate(String creationDate)
	{
		this.creationDate = creationDate;
	}

	public String getUpdateDate()
	{
		return this.updateDate;
	}

	public void setUpdateDate(String updateDate)
	{
		this.updateDate = updateDate;
	}

	public String getAccession()
	{
		return this.accession;
	}

	public void setAccession(String accession)
	{
		this.accession = accession;
	}

	public List<String> getSecondaryAccession()
	{
		return this.secondaryAccession != null ? this.secondaryAccession.getAccessions() : Collections.emptyList();
	}

	public void setSecondaryAccession(List<String> secondaryAccession)
	{
		this.secondaryAccession = new SecondaryAccessions().setAccessions(secondaryAccession);
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return this.description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getChemicalFormula()
	{
		return this.chemicalFormula;
	}

	public void setChemicalFormula(String chemicalFormula)
	{
		this.chemicalFormula = chemicalFormula;
	}

	public String getAverageMolecularWeight()
	{
		return this.averageMolecularWeight;
	}

	public void setAverageMolecularWeight(String averageMolecularWeight)
	{
		this.averageMolecularWeight = averageMolecularWeight;
	}

	public String getMonisotopicMolecularWeigth()
	{
		return this.monisotopicMolecularWeigth;
	}

	public void setMonisotopicMolecularWeigth(String monisotopicMolecularWeigth)
	{
		this.monisotopicMolecularWeigth = monisotopicMolecularWeigth;
	}

	public String getIUPACName()
	{
		return this.IUPACName;
	}

	public void setIUPACName(String iUPACName)
	{
		this.IUPACName = iUPACName;
	}

	public String getTraditionalIUAPC()
	{
		return this.traditionalIUAPC;
	}

	public void setTraditionalIUAPC(String traditionalIUAPC)
	{
		this.traditionalIUAPC = traditionalIUAPC;
	}

	public String getCasRegistryNumber()
	{
		return this.casRegistryNumber;
	}

	public void setCasRegistryNumber(String casRegistryNumber)
	{
		this.casRegistryNumber = casRegistryNumber;
	}

	public String getSmiles()
	{
		return this.smiles;
	}

	public void setSmiles(String smiles)
	{
		this.smiles = smiles;
	}

	public String getInchi()
	{
		return this.inchi;
	}

	public void setInchi(String inchi)
	{
		this.inchi = inchi;
	}

	public String getInchikey()
	{
		return this.inchikey;
	}

	public void setInchikey(String inchikey)
	{
		this.inchikey = inchikey;
	}

}
