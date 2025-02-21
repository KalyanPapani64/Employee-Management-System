package com.kalyan.emp_man_sys.model;

public class Department {
	private int depid;
	private String depname;
	private String deploc;
	
	public Department() {
		super();
	}
	
	public Department(int depid, String depname, String deploc) {
		super();
		this.depid = depid;
		this.depname = depname;
		this.deploc = deploc;
	}
	
	public int getDepid() {
		return depid;
	}
	
	public void setDepid(int depid) {
		this.depid = depid;
	}
	
	public String getDepname() {
		return depname;
	}
	
	public void setDepname(String depname) {
		this.depname = depname;
	}
	
	public String getDeploc() {
		return deploc;
	}
	
	
	public void setDeploc(String deploc) {
		this.deploc = deploc;
	}
	
	@Override
	public String toString() {
		return "Department [depid=" + depid + ", depname=" + depname + ", deploc=" + deploc +"]";
	}
}
