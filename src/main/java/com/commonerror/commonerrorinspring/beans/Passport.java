package com.commonerror.commonerrorinspring.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passport")
public class Passport {

	@Id
	private int id;
	private String passportNum;
	private String address;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "passport")
	private Employee empoyee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassportNum() {
		return passportNum;
	}

	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee getEmpoyee() {
		return empoyee;
	}

	public void setEmpoyee(Employee empoyee) {
		this.empoyee = empoyee;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", passportNum=" + passportNum + ", address=" + address + ", empoyee=" + empoyee
				+ "]";
	}

}
