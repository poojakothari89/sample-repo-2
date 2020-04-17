package org.jaxb.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Project")
//If you want you can define the order in which the fields are written
//Optional
@XmlType(propOrder = {"projectId","projectName","managerName" })
public class Project {

	private String projectId;
	private String projectName;
	private Employee managerName;

	
	public Project() {
		super();
	}

	public Project(String projectId, String projectName, Employee managerName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.managerName = managerName;
	}

	/**
	 * @return the projectId
	 */
	@XmlAttribute(name = "ProjectId")
	public String getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId
	 *            the projectId to set
	 */
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	/**
	 * @return the projectName
	 */
	@XmlElement(name = "ProjectName")
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName
	 *            the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * @return the managerName
	 */
	@XmlElement(name = "Manager")
	public Employee getManagerName() {
		return managerName;
	}

	/**
	 * @param managerName
	 *            the managerName to set
	 */
	public void setManagerName(Employee managerName) {
		managerName = managerName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", ManagerName=" + managerName
				+ "]";
	}

}
