package org.jaxb.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "IssueDetails")
//If you want you can define the order in which the fields are written
//Optional

public class IssueDetails {
	
	private int issueId;
	private IssueType issueType;
	private IssuePriority priority;
	private Employee issueOwner;
	private Employee issueSeeker;
	private String summary;
	private Date logDate;
	private Date closeDate;
	private Project projectDetails;

	
	/**
	 * @return the issueId
	 */
	@XmlAttribute(name="IssueId")
	public int getIssueId() {
		return issueId;
	}

	/**
	 * @param issueId
	 *            the issueId to set
	 */
	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	/**
	 * @return the issueType
	 */
	@XmlElement(name = "IssueType")
	public IssueType getIssueType() {
		return issueType;
	}

	/**
	 * @param issueType
	 *            the issueType to set
	 */
	public void setIssueType(IssueType issueType) {
		this.issueType = issueType;
	}

	/**
	 * @return the projectDetails
	 */
	@XmlElement(name = "Project")
	public Project getProjectDetails() {
		return projectDetails;
	}

	/**
	 * @param projectDetails
	 *            the projectDetails to set
	 */
	public void setProjectDetails(Project projectDetails) {
		this.projectDetails = projectDetails;
	}

	/**
	 * @return the priority
	 */
	@XmlElement(name = "Priority")
	public IssuePriority getPriority() {
		return priority;
	}

	/**
	 * @param priority
	 *            the priority to set
	 */
	public void setPriority(IssuePriority priority) {
		this.priority = priority;
	}

	/**
	 * @return the issueOwner
	 */
	@XmlElement(name = "Owner")
	public Employee getIssueOwner() {
		return issueOwner;
	}

	/**
	 * @param issueOwner
	 *            the issueOwner to set
	 */
	public void setIssueOwner(Employee issueOwner) {
		this.issueOwner = issueOwner;
	}

	/**
	 * @return the issueSeeker
	 */
	@XmlElement(name = "Seeker")
	public Employee getIssueSeeker() {
		return issueSeeker;
	}

	/**
	 * @param issueSeeker
	 *            the issueSeeker to set
	 */
	public void setIssueSeeker(Employee issueSeeker) {
		this.issueSeeker = issueSeeker;
	}

	/**
	 * @return the summary
	 */
	@XmlElement(name = "Summary")
	public String getSummary() {
		return summary;
	}

	/**
	 * @param summary
	 *            the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 * @return the logDate
	 */
	@XmlElement(name = "LogDate")
	public Date getLogDate() {
		return logDate;
	}

	/**
	 * @param logDate
	 *            the logDate to set
	 */
	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}

	/**
	 * @return the closeDate
	 */
	@XmlElement(name = "CloseDate")
	
	public Date getCloseDate() {
		return closeDate;
	}

	/**
	 * @param closeDate
	 *            the closeDate to set
	 */
	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IssueDetails [issueId=" + issueId + ", issueType=" + issueType + ", priority=" + priority
				+ ", issueOwner=" + issueOwner + ", issueSeeker=" + issueSeeker + ", summary=" + summary + ", logDate="
				+ logDate + ", closeDate=" + closeDate + ", projectDetails=" + projectDetails + "]";
	}

}
