package com.entity;

public class State {
	private int St_num;
	private String st_name;
	private String dt_name;
	private Employee e;
	public int getSt_num() {
		return St_num;
	}
	public void setSt_num(int st_num) {
		St_num = st_num;
	}
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	public String getDt_name() {
		return dt_name;
	}
	public void setDt_name(String dt_name) {
		this.dt_name = dt_name;
	}
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	public State(int st_num, String st_name, String dt_name, Employee e) {
		super();
		St_num = st_num;
		this.st_name = st_name;
		this.dt_name = dt_name;
		this.e = e;
	}
	@Override
	public String toString() {
		return "State [St_num=" + St_num + ", st_name=" + st_name + ", dt_name=" + dt_name + ", e=" + e + "]";
	}
	
	

}
