package com.rj.jdbc.bean;


public class Employee {
	private Integer eid;
	private String desg;
	private String ename;
	
	public Employee(Integer eid, String desg, String ename) {
	
		this.setEid(eid);
		this.setDesg(desg);
		this.setEname(ename);
	}
	
	

	public Employee() {
	
	}
     
	public Employee(String desg, String ename) {
		this.desg = desg;
		this.ename = ename;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

}
