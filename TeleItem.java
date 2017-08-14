package com.hp.tele;

public class TeleItem {
	private String name;
	private String gender;
	private int age;
	private String phonenum;
	private String qqnum;
	private String addr;
	
	public TeleItem(String name, String gender, int age, String phonenum, String qqnum, String addr) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phonenum = phonenum;
		this.qqnum = qqnum;
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getQqnum() {
		return qqnum;
	}
	public void setQqnum(String qqnum) {
		this.qqnum = qqnum;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "姓名：" + name + ", 性别：" + gender + ", 年龄：" + age + ", 电话：" + phonenum + ", QQ："
				+ qqnum + ", 地址：" + addr;
	}
}
