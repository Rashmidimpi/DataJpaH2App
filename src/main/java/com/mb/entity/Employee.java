package com.mb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private Integer empId;
	private String ename;
	private Double esalary;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getEsalary() {
		return esalary;
	}
	public void setEsalary(Double esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	
}
