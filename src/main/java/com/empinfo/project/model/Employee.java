package com.empinfo.project.model;

import java.util.Date;

public class Employee {
	private long id;
	private String firstName;
	private String lastName;
	private String workDept;
	private String phnNumber;
	private Date hired;

	public Employee() {

	}

	public Employee(long id, String firstName, String lastName, String workDept, String phnNumber) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.workDept = workDept;
		this.phnNumber = phnNumber;
		this.hired = new Date();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getWorkDept() {
		return workDept;
	}

	public void setWorkDept(String workDept) {
		this.workDept = workDept;
	}

	public String getPhnNumber() {
		return phnNumber;
	}

	public void setPhnNumber(String phnNumber) {
		this.phnNumber = phnNumber;
	}

	public Date getHired() {
		return hired;
	}

	public void setHired(Date hired) {
		this.hired = hired;
	}

}
