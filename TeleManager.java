package com.hp.tele;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 1.保存电话本的单条记录-->数组
 * 2.对电话本进行维护， 添加、删除、修改、查询 -->方法
 * */
public class TeleManager {
	private TeleItem[] phonebook = new TeleItem[20];
	private Scanner sc = new Scanner(System.in);
	//添加
	public void add() {
		System.out.println("---------添加电话本---------");
		System.out.print("姓名：");
		String name = sc.nextLine();
		for(int i = 0; i < phonebook.length; i++) {
			if(phonebook[i] != null && phonebook[i].getName().equals(name)) {
				System.out.println("姓名重复，添加失败");
				return;
			}
		}
		System.out.print("性别：");
		String gender = sc.nextLine();
		System.out.print("年龄：");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("电话:");
		String phonenum = sc.nextLine();
		System.out.print("QQ:");
		String qqnum = sc.nextLine();
		System.out.print("地址：");
		String addr = sc.nextLine();
		
		TeleItem item = new TeleItem(name, gender, age, phonenum, qqnum, addr);
		
		for(int i = 0; i < phonebook.length; i++) {
			if(phonebook[i] == null) {
				phonebook[i] = item;
				System.out.println(item);
				System.out.println("添加成功");
				return;
			}
		}
	}
	
	//查询所有
	public void findAll() {
		for(int i = 0; i < phonebook.length; i++) {
			if(phonebook[i] != null) {
				System.out.println(phonebook[i]);
			}
		}
	}
	
	//删除
	public void delete() {
		System.out.print("请输入要删除的姓名：");
		String name = sc.nextLine();
		for(int i = 0; i < phonebook.length; i++) {
			if(phonebook[i] != null && phonebook[i].getName().equals(name)) {
				System.out.println(phonebook[i]);
				System.out.println("确定要删除吗？1（是）0（否）");
				String choose = sc.nextLine();
				if(choose.equals("1")) {
					phonebook[i] = null;
					System.out.println("删除成功。");
					break;
				} 
			}
		}
	}
	
	//修改
	public void modify() {
		System.out.print("请输入要修改的姓名：");
		String name = sc.nextLine();
		TeleItem item = null;
		boolean flag = false;//假定没有查到
		for(int i = 0; i < phonebook.length; i++) {
			if(phonebook[i] != null && phonebook[i].getName().equals(name)) {
				System.out.println(phonebook[i]);
				flag = true;//查到了
				item = phonebook[i];
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("没有查到任何信息。。。");
			return;
		}
		
		System.out.print("姓名：");
		name = sc.nextLine();
		for(int i = 0; i < phonebook.length; i++) {
			if(phonebook[i] != null && item != phonebook[i] && phonebook[i].getName().equals(name)) {
				System.out.println("要修改的名字和其他项重名，不允许修改");
				return;
			}
		}
		item.setName(name);
		System.out.print("性别：");
		String gender = sc.nextLine();
		item.setGender(gender);
		System.out.print("年龄：");
		int age = sc.nextInt();
		sc.nextLine();
		item.setAge(age);
		System.out.print("电话:");
		String phonenum = sc.nextLine();
		item.setPhonenum(phonenum);
		System.out.print("QQ:");
		String qqnum = sc.nextLine();
		item.setQqnum(qqnum);
		System.out.print("地址：");
		String addr = sc.nextLine();
		item.setAddr(addr);
		System.out.println(item);
		System.out.println("修改成功");
	}
	//根据姓名查询
	public void findByName() {
		System.out.print("请输入要查询的姓名：");
		String name = sc.nextLine();
		boolean flag = false;//假定没有查到
		for(int i = 0; i < phonebook.length; i++) {
			if(phonebook[i] != null && phonebook[i].getName().equals(name)) {
				System.out.println(phonebook[i]);
				flag = true;//查到了
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("没有查到任何信息。。。");
		}
	}
}
