import java.util.Scanner;

public class Order {

	Scanner sc = new Scanner(System.in);

	int sum = 0; 
	int num = 0;
	String select = "";
	int pay = 0;
	int coffeemenu;
	int smoothiemenu;
	int cakemenu;
	String menu1 = " "; 
	String con;

	String[] menu = new String[30];

	public void coffeeOrder() {
		
		System.out.println("Ŀ�Ǹ� �����ϼ���.");
		System.out.println("1. �Ƹ޸�ī��" + " " +"2. ī���ī" + " " + "3. �����߶�");

		coffeemenu = sc.nextInt();

		switch (coffeemenu) {
		case 1: 
			select = "�Ƹ޸�ī��";
			pay = 3000;			
			break;
		case 2:
			select = "ī���ī";
			pay = 3500;
		case 3:
			select = "ī��Ḷ���߶�";
			pay = 4000;
		}

		System.out.println("������ �޴��� " + select + " ������ " + pay + " �Դϴ�.");
		
	}
	public void smoothieOrder() {
		
		System.out.println("������ �����ϼ���.");
		System.out.println("1. ���Ʈ ������." + " " + "2. ���� ������");

		smoothiemenu = sc.nextInt();

		switch(smoothiemenu) {
		case 1:
			select = "���Ʈ ������";
			pay = 3500;
		case 2:
			select = "���� ������";
			pay = 4000;
		}
		System.out.println("������ �޴��� " + select + " ������ " + pay+ " �Դϴ�.");
		
	}

	public void cakeOrder() {
		
		System.out.println("����Ʈ�� �����ϼ���.");
		System.out.println("1. ġ�� ����ũ" + " " + "2. ��������ũ");

		cakemenu = sc.nextInt();

		switch(cakemenu) {
		case 1:
			select = "ġ�� ����ũ";
			pay = 4000;
		case 2:
			select = "���� ����ũ";
			pay = 4500;
		}
		System.out.println("������ �޴��� " + select + " ������ " + pay + " �Դϴ�.");
	}
	
}


