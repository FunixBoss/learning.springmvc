package com.learning.entity;

public class Employee {
	private int empId;
	private String empName;
	private String address;

	public Employee() {
	}

	public Employee(int empId, String empName, String address) {
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void makeNoise() {
		System.out.println("Mowzer cat says meow");
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}

}
