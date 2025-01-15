package com.entity;


public class Country {
	private String c_name;
	private String std;
	private int num;
	private State s;
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public State getS() {
		return s;
	}
	public void setS(State s) {
		this.s = s;
	}
	public Country(String c_name, String std, int num, State s) {
		super();
		this.c_name = c_name;
		this.std = std;
		this.num = num;
		this.s = s;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Country [c_name=" + c_name + ", std=" + std + ", num=" + num + ", s=" + s + "]";
	}
	
	

}
