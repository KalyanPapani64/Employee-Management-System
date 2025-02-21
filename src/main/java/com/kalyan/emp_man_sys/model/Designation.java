package com.kalyan.emp_man_sys.model;

public class Designation {
	private int desid;
	private String desname;
	private int despay;
	
	public Designation() {
		super();
	}
	
	public Designation(int desid, String desname, int despay) {
		super();
		this.desid = desid;
		this.desname = desname;
		this.despay = despay;
	}
	
	public int getDesid() {
		return desid;
	}
	
	public void setDesid(int desid) {
		this.desid = desid;
	}
	
	public String getDesname() {
		return desname;
	}
	
	public void setDesname(String desname) {
		this.desname = desname;
	}
	
	public int getDespay() {
		return despay;
	}
	
	
	public void setDespay(int despay) {
		this.despay = despay;
	}
	
	@Override
	public String toString() {
		return "Designation [desid=" + desid + ", desname=" + desname + ", despay=" + despay +"]";
	}
}
