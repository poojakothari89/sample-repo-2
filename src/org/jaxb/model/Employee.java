package org.jaxb.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Employee")
//If you want you can define the order in which the fields are written
//Optional
@XmlType(propOrder = {"teamId","firstName","lastName","email" })

public class Employee {
	

	private int teamId;
	private String firstName;
	private String lastName;
	private String email;
	
	
	public Employee() {
		super();
	}

	public Employee(int teamId, String firstName, String lastName, String email) {
		super();
		this.teamId = teamId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	@XmlAttribute(name="TeamId")
	public  int getTeamId() {
		return teamId;
	}
	public  void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	@XmlElement(name = "FirstName")
	public  String getFirstName() {
		return firstName;
	}
	public  void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@XmlElement(name = "LastName")
	public  String getLastName() {
		return lastName;
	}
	public  void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@XmlElement(name = "EmailId")
	public  String getEmail() {
		return email;
	}
	public  void setEmail(String email) {
		this.email = email;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [teamId=" + teamId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}
	
}
