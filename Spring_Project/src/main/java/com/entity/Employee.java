package com.entity;

public class Employee {
	private int id;
	private String e_name;
	private String email;
	private long ph_num;
	private long sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPh_num() {
		return ph_num;
	}
	public void setPh_num(long ph_num) {
		this.ph_num = ph_num;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String e_name, String email, long ph_num, long sal) {
		super();
		this.id = id;
		this.e_name = e_name;
		this.email = email;
		this.ph_num = ph_num;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", e_name=" + e_name + ", email=" + email + ", ph_num=" + ph_num + ", sal=" + sal
				+ "]";
	}
	

}
