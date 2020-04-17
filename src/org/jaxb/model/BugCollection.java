package org.jaxb.model;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "BugCollection")
public class BugCollection {

	// XmLElementWrapper generates a wrapper element around XML representation
	//@XmlElementWrapper(name = "issueList")
	// XmlElement sets the name of the entities
	@XmlElement(name = "IssueDetails")
	private List<IssueDetails> issueList;
	
	private Date collectionDate;
	

	/**
	 * @return the collectionDate
	 */
	public Date getCollectionDate() {
		return collectionDate;
	}

	/**
	 * @param collectionDate the collectionDate to set
	 */
	public void setCollectionDate(Date collectionDate) {
		this.collectionDate = collectionDate;
	}

	/**
	 * @return the issueDetailsList
	 */
	
	public List<IssueDetails> getIssueDetailsList() {
		return issueList;
	}

	/**
	 * @param issueDetailsList
	 *            the issueDetailsList to set
	 */
	public void setIssueDetailsList(List<IssueDetails> issueDetailsList) {
		this.issueList = issueDetailsList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BugCollection [issueList=" + issueList + ", collectionDate=" + collectionDate + "]";
	}



}
