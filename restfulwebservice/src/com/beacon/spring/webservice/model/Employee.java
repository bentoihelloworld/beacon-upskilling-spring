package com.beacon.spring.webservice.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	private String enterpriseId;
	private String firstName;
	private String position;

	public Employee(String enterpriseId, String firstName, String position) {
		super();
		this.enterpriseId = enterpriseId;
		this.firstName = firstName;
		this.position = position;
	}
	
	public Employee() {
		
	}

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getFirstName() {
		return firstName;
	}
	@XmlElement
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPosition() {
		return position;
	}
	@XmlElement
	public void setPosition(String position) {
		this.position = position;
	}

}
