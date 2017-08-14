package com.hp.tele;

import java.util.Scanner;

public class Main {
	
	public static void help() {
		System.out.println("---------------------------电话本管理系统---------------------------");
		System.out.println("1.添加	2.删除	3.修改	4.查询所有	5.根据姓名查询	0.退出");
		System.out.println("---------------------------电话本管理系统---------------------------");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TeleManager tm = new TeleManager();
		
		while(true) {
			help();
			int choose = sc.nextInt();
			switch (choose) {
				case 1:
					tm.add();
					break;
				case 2:
					tm.delete();
					break;
				case 3:
					tm.modify();
					break;
				case 4:
					tm.findAll();
					break;
				case 5:
					Integer i = 5;
					tm.findByName();
					break;
				case 0:
					System.exit(0);
				default:
					System.out.println("输入错误，请重新输入");
					break;
			}
		}
	}

}
