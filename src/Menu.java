

import java.util.Scanner;


public class Menu {

	public Menu() {

		Scanner sc = new Scanner(System.in);
		Order or = new Order();

		int sum = 0;
		int pay = 0;
		String con;
		String menu1 ="";
		String select = "";

		System.out.println("�޴��� ������.(1~7) ");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------");
		System.out.println("		Ŀ��            					������       					���̵�  ");
		System.out.println("1.�Ƹ޸�ī��			3,000�� 		  	4.���Ʈ ������	3,500��			6.ġ������		4,000��");
		System.out.println("2.ī���ī				3,500��			5.����   ������	4,000��			7.��������		4,000��");
		System.out.println("3.ī��ḶŰ�߶� 			4,000��");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------");
		while (true) {
			System.out.println("�޴��� ������.");
			System.out.println("1. Ŀ��" + " " + "2. ������" + " " + "3. ����ũ" + " " + "4. �ֹ�������");
			
			System.out.println("�����ϼ��� :");
			int num = sc.nextInt();

			switch (num) {

			case 1: 
				or.coffeeOrder();
				sum = sum + or.pay;
				menu1 = menu1 + or.select;
				break;
			case 2: 
				or.smoothieOrder(); 
				sum = sum + or.pay;
				menu1 = menu1 + or.select;
				break;
			case 3: 
				or.cakeOrder(); 
				sum = sum + or.pay;
				menu1 = menu1 + or.select;
				break;
			case 4:
				System.out.println("�ֹ� ������");			
				break;
			default: 
				System.out.println("�ٽ� �����ϼ���!");
			}
			sum = sum + pay;
			menu1 = menu1 + select;
			System.out.println("�߰� �����Ͻðڽ��ϱ�? (y or n)");
			con=sc.next();
			if(con.equals("y")) {
				continue;

			}if(con.equals("n")){
			}else
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			break;

		}
		System.out.println("���Բ��� �ֹ��Ͻ� �޴��� " + menu1 +"  "+ "�̰� "+ " �� ������ "  + "  "+ sum + " �Դϴ�.");
		System.out.println();
		System.out.println("�����Ͻó���? ( y or n)");

		con=sc.next();
		if(con.equals("y")) {
			System.out.println(" -------------------------------");
			System.out.println("id : hanna");
			System.out.println("pass : 1234");
			System.out.println(" -------------------------------");
			System.out.println("���� ����Ʈ�� 3�� �ֽ��ϴ�.");
			System.out.println("�Ϸ�Ǿ����ϴ�. �����մϴ�.");
		}else {
			System.out.println("�Ϸ�Ǿ����ϴ�. �����մϴ�.");
		}
	}
}


