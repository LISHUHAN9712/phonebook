package com.hp.tele;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 1.����绰���ĵ�����¼-->����
 * 2.�Ե绰������ά���� ��ӡ�ɾ�����޸ġ���ѯ -->����
 * */
public class TeleManager {
	private TeleItem[] phonebook = new TeleItem[20];
	private Scanner sc = new Scanner(System.in);
	//���
	public void add() {
		System.out.println("---------��ӵ绰��---------");
		System.out.print("������");
		String name = sc.nextLine();
		for(int i = 0; i < phonebook.length; i++) {
			if(phonebook[i] != null && phonebook[i].getName().equals(name)) {
				System.out.println("�����ظ������ʧ��");
				return;
			}
		}
		System.out.print("�Ա�");
		String gender = sc.nextLine();
		System.out.print("���䣺");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("�绰:");
		String phonenum = sc.nextLine();
		System.out.print("QQ:");
		String qqnum = sc.nextLine();
		System.out.print("��ַ��");
		String addr = sc.nextLine();
		
		TeleItem item = new TeleItem(name, gender, age, phonenum, qqnum, addr);
		
		for(int i = 0; i < phonebook.length; i++) {
			if(phonebook[i] == null) {
				phonebook[i] = item;
				System.out.println(item);
				System.out.println("��ӳɹ�");
				return;
			}
		}
	}
	
	//��ѯ����
	public void findAll() {
		for(int i = 0; i < phonebook.length; i++) {
			if(phonebook[i] != null) {
				System.out.println(phonebook[i]);
			}
		}
	}
	
	//ɾ��
	public void delete() {
		System.out.print("������Ҫɾ����������");
		String name = sc.nextLine();
		for(int i = 0; i < phonebook.length; i++) {
			if(phonebook[i] != null && phonebook[i].getName().equals(name)) {
				System.out.println(phonebook[i]);
				System.out.println("ȷ��Ҫɾ����1���ǣ�0����");
				String choose = sc.nextLine();
				if(choose.equals("1")) {
					phonebook[i] = null;
					System.out.println("ɾ���ɹ���");
					break;
				} 
			}
		}
	}
	
	//�޸�
	public void modify() {
		System.out.print("������Ҫ�޸ĵ�������");
		String name = sc.nextLine();
		TeleItem item = null;
		boolean flag = false;//�ٶ�û�в鵽
		for(int i = 0; i < phonebook.length; i++) {
			if(phonebook[i] != null && phonebook[i].getName().equals(name)) {
				System.out.println(phonebook[i]);
				flag = true;//�鵽��
				item = phonebook[i];
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("û�в鵽�κ���Ϣ������");
			return;
		}
		
		System.out.print("������");
		name = sc.nextLine();
		for(int i = 0; i < phonebook.length; i++) {
			if(phonebook[i] != null && item != phonebook[i] && phonebook[i].getName().equals(name)) {
				System.out.println("Ҫ�޸ĵ����ֺ��������������������޸�");
				return;
			}
		}
		item.setName(name);
		System.out.print("�Ա�");
		String gender = sc.nextLine();
		item.setGender(gender);
		System.out.print("���䣺");
		int age = sc.nextInt();
		sc.nextLine();
		item.setAge(age);
		System.out.print("�绰:");
		String phonenum = sc.nextLine();
		item.setPhonenum(phonenum);
		System.out.print("QQ:");
		String qqnum = sc.nextLine();
		item.setQqnum(qqnum);
		System.out.print("��ַ��");
		String addr = sc.nextLine();
		item.setAddr(addr);
		System.out.println(item);
		System.out.println("�޸ĳɹ�");
	}
	//����������ѯ
	public void findByName() {
		System.out.print("������Ҫ��ѯ��������");
		String name = sc.nextLine();
		boolean flag = false;//�ٶ�û�в鵽
		for(int i = 0; i < phonebook.length; i++) {
			if(phonebook[i] != null && phonebook[i].getName().equals(name)) {
				System.out.println(phonebook[i]);
				flag = true;//�鵽��
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("û�в鵽�κ���Ϣ������");
		}
	}
}
