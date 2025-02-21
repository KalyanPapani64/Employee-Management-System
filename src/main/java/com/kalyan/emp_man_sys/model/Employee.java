package com.kalyan.emp_man_sys.model;

public class Employee {
	private int empid;
	private String empname;
	private String empfname;
	private String gender;
	private int experience;
	private int depid;
	private int desid;
	
	public Employee() {
		super();
	}
	
	public Employee(int empid, String empname, String empfname, String gender, int experience, int depid, int desid) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empfname = empfname;
		this.gender = gender;
		this.experience = experience;
		this.depid = depid;
		this.desid = desid;
	}
	
	public int getEmpid() {
		return empid;
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public String getEmpname() {
		return empname;
	}
	
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public String getEmpfname() {
		return empfname;
	}
	
	public void setEmpfname(String empfname) {
		this.empfname = empfname;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getExperience() {
		return empid;
	}
	
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public int getDepid() {
		return depid;
	}
	
	public void setDepid(int depid) {
		this.depid = depid;
	}
	
	public int getDesid() {
		return desid;
	}
	
	public void setDesid(int desid) {
		this.desid = desid;
	}
	@Override
	public String toString() {
		return "Department [empid=" + empid + ", empname=" + empname + ", empfname=" + empfname + "gender=" + gender + ", experience=" + experience + ", depid=" + depid + ", desid="+ desid +"]";
	}
}


