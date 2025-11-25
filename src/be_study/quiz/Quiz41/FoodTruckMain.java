package be_study.quiz.Quiz41;

import java.util.Scanner;

public class FoodTruckMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FoodTruck truck = new FoodTruck();

		// 초기 메뉴
		truck.addMenu(new Food1("김밥", 1000));
		truck.addMenu(new Food1("떡볶이", 3000));
		truck.addMenu(new Food1("오뎅", 1000));

		// 초기 재고 설정 (필요하면 수정)
		truck.addInven("김밥", 50);
		truck.addInven("떡볶이", 20);
		truck.addInven("오뎅", 30);

		while (true) {
			System.out.println("\n=== Food Truck ===");
			System.out.println("1. 메뉴 보기");
			System.out.println("2. 주문하기");
			System.out.println("3. 재고 추가");
			System.out.println("4. 마감하기");
			System.out.print("선택: ");
			int choice = sc.nextInt();

			if (choice == 1) {
				truck.showMenu();
			} else if (choice == 2) {
				System.out.print("메뉴 이름: ");
				String name = sc.next();
				System.out.print("수량: ");
				int count = sc.nextInt();
				truck.order(name, count);
			} else if (choice == 3) {
				System.out.print("재고 추가할 메뉴 이름: ");
				String name = sc.next();
				System.out.print("수량: ");
				int count = sc.nextInt();
				truck.addInven(name, count);
			} else if (choice == 4) {
				truck.close();
				break;
			} else {
				System.out.println("잘못된 선택!");
			}
		}

		sc.close();
	}
}
