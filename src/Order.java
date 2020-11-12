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
		
		System.out.println("커피를 선택하세요.");
		System.out.println("1. 아메리카노" + " " +"2. 카페모카" + " " + "3. 마끼야또");

		coffeemenu = sc.nextInt();

		switch (coffeemenu) {
		case 1: 
			select = "아메리카노";
			pay = 3000;			
			break;
		case 2:
			select = "카페모카";
			pay = 3500;
		case 3:
			select = "카라멜마끼야또";
			pay = 4000;
		}

		System.out.println("선택한 메뉴는 " + select + " 가격은 " + pay + " 입니다.");
		
	}
	public void smoothieOrder() {
		
		System.out.println("스무디를 선택하세요.");
		System.out.println("1. 요거트 스무디." + " " + "2. 딸기 스무디");

		smoothiemenu = sc.nextInt();

		switch(smoothiemenu) {
		case 1:
			select = "요거트 스무디";
			pay = 3500;
		case 2:
			select = "딸기 스무디";
			pay = 4000;
		}
		System.out.println("선택한 메뉴는 " + select + " 가격은 " + pay+ " 입니다.");
		
	}

	public void cakeOrder() {
		
		System.out.println("디저트를 선택하세요.");
		System.out.println("1. 치즈 케이크" + " " + "2. 초코케이크");

		cakemenu = sc.nextInt();

		switch(cakemenu) {
		case 1:
			select = "치즈 케이크";
			pay = 4000;
		case 2:
			select = "초코 케이크";
			pay = 4500;
		}
		System.out.println("선택한 메뉴는 " + select + " 가격은 " + pay + " 입니다.");
	}
	
}


