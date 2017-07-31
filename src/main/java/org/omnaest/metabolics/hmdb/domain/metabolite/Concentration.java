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
package org.omnaest.metabolics.hmdb.domain.metabolite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import org.apache.commons.lang.StringUtils;
import org.omnaest.metabolics.hmdb.domain.base.References;

@XmlAccessorType(XmlAccessType.NONE)
public class Concentration
{
	@XmlElement(name = "biofluid")
	private String biofluid;

	@XmlElement(name = "concentration_value")
	private String value;

	@XmlElement(name = "concentration_units")
	private String units;

	@XmlElement(name = "subject_age")
	private String subjectAge;

	@XmlElement(name = "subject_sex")
	private String subjectSex;

	@XmlElement(name = "subject_condition")
	private String subjectCondition;

	@XmlElement(name = "references")
	private References references;

	public String getBiofluid()
	{
		return this.biofluid;
	}

	public void setBiofluid(String biofluid)
	{
		this.biofluid = biofluid;
	}

	public String getValue()
	{
		return this.value;
	}

	public void setValue(String value)
	{
		this.value = value;
	}

	public String getUnits()
	{
		return this.units;
	}

	public void setUnits(String units)
	{
		this.units = units;
	}

	public String getSubjectAge()
	{
		return this.subjectAge;
	}

	public void setSubjectAge(String subjectAge)
	{
		this.subjectAge = subjectAge;
	}

	public String getSubjectSex()
	{
		return this.subjectSex;
	}

	public void setSubjectSex(String subjectSex)
	{
		this.subjectSex = subjectSex;
	}

	public String getSubjectCondition()
	{
		return this.subjectCondition;
	}

	public boolean isSubjectConditionNormal()
	{
		return StringUtils.equalsIgnoreCase(this.subjectCondition, "Normal");
	}

	public void setSubjectCondition(String subjectCondition)
	{
		this.subjectCondition = subjectCondition;
	}

	public References getReferences()
	{
		return this.references;
	}

	public void setReferences(References references)
	{
		this.references = references;
	}

}