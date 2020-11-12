

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

		System.out.println("메뉴를 고르세요.(1~7) ");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------");
		System.out.println("		커피            					스무디       					사이드  ");
		System.out.println("1.아메리카노			3,000원 		  	4.요거트 스무디	3,500원			6.치즈케익		4,000원");
		System.out.println("2.카페모카				3,500원			5.딸기   스무디	4,000원			7.초코케익		4,000원");
		System.out.println("3.카라멜마키야또 			4,000원");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------");
		while (true) {
			System.out.println("메뉴를 고르세요.");
			System.out.println("1. 커피" + " " + "2. 스무디" + " " + "3. 케이크" + " " + "4. 주문끝내기");
			
			System.out.println("선택하세요 :");
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
				System.out.println("주문 끝내기");			
				break;
			default: 
				System.out.println("다시 선택하세요!");
			}
			sum = sum + pay;
			menu1 = menu1 + select;
			System.out.println("추가 선택하시겠습니까? (y or n)");
			con=sc.next();
			if(con.equals("y")) {
				continue;

			}if(con.equals("n")){
			}else
				System.out.println("잘못 입력하였습니다.");
			break;

		}
		System.out.println("고객님꼐서 주문하신 메뉴는 " + menu1 +"  "+ "이고 "+ " 총 가격은 "  + "  "+ sum + " 입니다.");
		System.out.println();
		System.out.println("적립하시나요? ( y or n)");

		con=sc.next();
		if(con.equals("y")) {
			System.out.println(" -------------------------------");
			System.out.println("id : hanna");
			System.out.println("pass : 1234");
			System.out.println(" -------------------------------");
			System.out.println("현재 포인트는 3장 있습니다.");
			System.out.println("완료되었습니다. 감사합니다.");
		}else {
			System.out.println("완료되었습니다. 감사합니다.");
		}
	}
}


