package com.hp.tele;

import java.util.Scanner;

public class Main {
	
	public static void help() {
		System.out.println("---------------------------�绰������ϵͳ---------------------------");
		System.out.println("1.���	2.ɾ��	3.�޸�	4.��ѯ����	5.����������ѯ	0.�˳�");
		System.out.println("---------------------------�绰������ϵͳ---------------------------");
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
					System.out.println("�����������������");
					break;
			}
		}
	}

}
