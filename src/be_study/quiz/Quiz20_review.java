package be_study.quiz;

import java.util.Scanner;

public class Quiz20_review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// 배열 활용 리팩토링
		// 하드코딩 소프트코딩

		String[] menuArr = { "아메리카노", "카페라떼", "바닐라라떼" };
		int[] priceArr = { 3500, 4100, 4300 };
		int[] countArr = new int[menuArr.length];

		int menu;
		int count;
		String addOrder;

		while (true) {
			System.out.println("======== 메뉴 ========");
			for (int i = 0; i < menuArr.length; i++) {
				System.out.printf("%d.%8s%7d원\n", i + 1, menuArr[i], priceArr[i]);
			}
			System.out.println("=====================");

			System.out.print("메뉴 선택 : ");
			menu = scanner.nextInt();

			if (menu >= 1 && menu <= menuArr.length) {

			} else {
				System.out.println("잘못입력했습니다. 메뉴를 다시 선택");
				continue;
			}

			System.out.print("수량 선택 : ");
			count = scanner.nextInt();

			countArr[menu - 1] += count; // 선택메뉴-1 위치 인덱스에 수량 추가

			scanner.nextLine();

			while (true) {

				System.out.print("추가주문 하시겠습니까? (y/n) : ");
				addOrder = scanner.nextLine();

				if (addOrder.equals("y") || addOrder.equals("n")) {
					break;
				} else {
					System.out.println("잘못입력했습니다. 추가주문(y/n) 다시 선택");
				}
			}

			if (addOrder.equals("n")) {
				break;
			}
		}
		System.out.println("=====================");
		int total = 0;
		for (int i = 0; i < menuArr.length; i++) {
			if (countArr[i] > 0) {
				System.out.printf("%s %d잔 : %d원\n", menuArr[i], countArr[i], countArr[i] * priceArr[i]);
				total += countArr[i] * priceArr[i];
			}
		}

		System.out.println("=====================");
		System.out.println("총액 : " + total + "원");

	}
}

//		//하드코딩
//		int menu1Count = 0;
//		int menu2Count = 0;
//		int menu3Count = 0;
//
//		int menu;
//		int count;
//		String addOrder;
//
//		while (true) {
//			System.out.println("======== 메뉴 ========");
//			System.out.println("1. 아메리카노   3500원");
//			System.out.println("1. 카페라떼    4100원");
//			System.out.println("1. 바닐라라떼   4300원");
//			System.out.println("=====================");
//
//			System.out.print("메뉴 선택 : ");
//			menu = scanner.nextInt();
//
//			if (menu >= 1 && menu <= 3) {
//
//				System.out.print("수량 선택 : ");
//				count = scanner.nextInt();
//
//				if (menu == 1) {
//					menu1Count += count;
//				} else if (menu == 2) {
//					menu2Count += count;
//				} else {
//					menu3Count += count;
//				}
//
//				scanner.nextLine();
//
//				while (true) {
//
//					System.out.print("추가주문 하시겠습니까? (y/n) : ");
//					addOrder = scanner.nextLine();
//
//					if (addOrder.equals("y") || addOrder.equals("n")) {
//						break;
//					} else {
//						System.out.println("잘못입력했습니다. 추가주문(y/n) 다시 선택");
//					}
//				}
//
//				if (addOrder.equals("n")) {
//					System.out.println("=====================");
//					if (menu1Count > 0) {
//						System.out.printf("아메리카노 %d잔 : %d원\n", menu1Count, menu1Count * 3500);
//					}
//					if (menu2Count > 0)
//						System.out.printf("카페라떼 %d잔 : %d원\n", menu2Count, menu2Count * 4100);
//					if (menu3Count > 0)
//						System.out.printf("바닐라라떼 %d잔 : %d원\n", menu3Count, menu3Count * 4300);
//
//					int total = menu1Count * 3500 + menu2Count * 4100 + menu3Count * 4300;
//					System.out.println("=====================");
//					System.out.println("총액 : " + total + "원");
//
//					break;
//				}
//
//			} else {
//				System.out.println("잘못입력했습니다. 메뉴 다시 선택");
//				continue;
//			}

//}
//
//}
