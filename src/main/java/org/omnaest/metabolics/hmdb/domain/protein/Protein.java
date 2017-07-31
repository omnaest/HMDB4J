package org.omnaest.metabolics.hmdb.domain.protein;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import org.omnaest.metabolics.hmdb.domain.base.Pathways;
import org.omnaest.metabolics.hmdb.domain.base.References;
import org.omnaest.metabolics.hmdb.domain.base.Synonyms;

@XmlAccessorType(XmlAccessType.NONE)
public class Protein
{
	@XmlElement
	private String version;

	@XmlElement(name = "creation_date")
	private String creationDate;

	@XmlElement(name = "update_date")
	private String updateDate;

	@XmlElement
	private Accession accession;

	@XmlElement(name = "secondary_accessions")
	private Accessions secondaryAccessions;

	@XmlElement(name = "protein_type")
	private String proteinType;

	@XmlElement
	private Synonyms synonyms;

	@XmlElement(name = "gene_name")
	private String geneName;

	@XmlElement(name = "general_function")
	private String generalFunction;

	@XmlElement(name = "specific_function")
	private String specificFunction;

	@XmlElement
	private Pathways pathways;

	@XmlElement(name = "metabolite_associations")
	private MetaboliteAssociations metaboliteAssociations;

	@XmlElement(name = "subcellular_locations")
	private SubcellularLocations subcellularLocations;

	@XmlElement(name = "gene_properties")
	private GeneProperties geneProperties;

	@XmlElement(name = "protein_properties")
	private ProteinProperties proteinProperties;

	@XmlElement(name = "genbank_protein_id")
	private String genbankProteinId;

	@XmlElement(name = "uniprot_id")
	private String uniprotId;

	@XmlElement(name = "uniprot_name")
	private String uniprotName;

	//pdb_ids

	@XmlElement(name = "genbank_gene_id")
	private String genbankGeneId;

	@XmlElement(name = "genecard_id")
	private String genecardId;

	@XmlElement(name = "geneatlas_id")
	private String geneatlasId;

	@XmlElement(name = "hgnc_id")
	private String hgncId;

	@XmlElement(name = "general_references")
	private References generalReferences;

	@XmlElement(name = "metabolite_references")
	private MetaboliteReferences metaboliteReferences;

	public String getVersion()
	{
		return version;
	}

	public void setVersion(String version)
	{
		this.version = version;
	}

	public String getCreationDate()
	{
		return creationDate;
	}

	public void setCreationDate(String creationDate)
	{
		this.creationDate = creationDate;
	}

	public String getUpdateDate()
	{
		return updateDate;
	}

	public void setUpdateDate(String updateDate)
	{
		this.updateDate = updateDate;
	}

	public Accession getAccession()
	{
		return accession;
	}

	public void setAccession(Accession accession)
	{
		this.accession = accession;
	}

	public Accessions getSecondaryAccessions()
	{
		return secondaryAccessions;
	}

	public void setSecondaryAccessions(Accessions secondaryAccessions)
	{
		this.secondaryAccessions = secondaryAccessions;
	}

	public String getProteinType()
	{
		return proteinType;
	}

	public void setProteinType(String proteinType)
	{
		this.proteinType = proteinType;
	}

	public Synonyms getSynonyms()
	{
		return synonyms;
	}

	public void setSynonyms(Synonyms synonyms)
	{
		this.synonyms = synonyms;
	}

	public String getGeneName()
	{
		return geneName;
	}

	public void setGeneName(String geneName)
	{
		this.geneName = geneName;
	}

	public String getGeneralFunction()
	{
		return generalFunction;
	}

	public void setGeneralFunction(String generalFunction)
	{
		this.generalFunction = generalFunction;
	}

	public String getSpecificFunction()
	{
		return specificFunction;
	}

	public void setSpecificFunction(String specificFunction)
	{
		this.specificFunction = specificFunction;
	}

	public Pathways getPathways()
	{
		return pathways;
	}

	public void setPathways(Pathways pathways)
	{
		this.pathways = pathways;
	}

	public MetaboliteAssociations getMetaboliteAssociations()
	{
		return metaboliteAssociations;
	}

	public void setMetaboliteAssociations(MetaboliteAssociations metaboliteAssociations)
	{
		this.metaboliteAssociations = metaboliteAssociations;
	}

	public SubcellularLocations getSubcellularLocations()
	{
		return subcellularLocations;
	}

	public void setSubcellularLocations(SubcellularLocations subcellularLocations)
	{
		this.subcellularLocations = subcellularLocations;
	}

	public GeneProperties getGeneProperties()
	{
		return geneProperties;
	}

	public void setGeneProperties(GeneProperties geneProperties)
	{
		this.geneProperties = geneProperties;
	}

	public ProteinProperties getProteinProperties()
	{
		return proteinProperties;
	}

	public void setProteinProperties(ProteinProperties proteinProperties)
	{
		this.proteinProperties = proteinProperties;
	}

	public String getGenbankProteinId()
	{
		return genbankProteinId;
	}

	public void setGenbankProteinId(String genbankProteinId)
	{
		this.genbankProteinId = genbankProteinId;
	}

	public String getUniprotId()
	{
		return uniprotId;
	}

	public void setUniprotId(String uniprotId)
	{
		this.uniprotId = uniprotId;
	}

	public String getUniprotName()
	{
		return uniprotName;
	}

	public void setUniprotName(String uniprotName)
	{
		this.uniprotName = uniprotName;
	}

	public String getGenbankGeneId()
	{
		return genbankGeneId;
	}

	public void setGenbankGeneId(String genbankGeneId)
	{
		this.genbankGeneId = genbankGeneId;
	}

	public String getGenecardId()
	{
		return genecardId;
	}

	public void setGenecardId(String genecardId)
	{
		this.genecardId = genecardId;
	}

	public String getGeneatlasId()
	{
		return geneatlasId;
	}

	public void setGeneatlasId(String geneatlasId)
	{
		this.geneatlasId = geneatlasId;
	}

	public String getHgncId()
	{
		return hgncId;
	}

	public void setHgncId(String hgncId)
	{
		this.hgncId = hgncId;
	}

	public References getGeneralReferences()
	{
		return generalReferences;
	}

	public void setGeneralReferences(References generalReferences)
	{
		this.generalReferences = generalReferences;
	}

	public MetaboliteReferences getMetaboliteReferences()
	{
		return metaboliteReferences;
	}

	public void setMetaboliteReferences(MetaboliteReferences metaboliteReferences)
	{
		this.metaboliteReferences = metaboliteReferences;
	}

}
