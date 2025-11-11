package be_study.quiz;

import java.util.Scanner;

public class Quiz20_teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] menuArr = { "아메리카노", "카페라떼", "바닐라라떼", "레몬티" }; // 메뉴이름
		int[] priceArr = { 3500, 4100, 4300, 3800 }; // 메뉴가격
		int[] countArr = new int[menuArr.length]; // 메뉴주문수량

		int menu; // 메뉴선택
		int count; // 수량선택
		String addOrder; // 추가주문여부

		while (true) {

			while (true) {
				// 메뉴보여주기
				System.out.println("=======메뉴======");
				for (int i = 0; i < menuArr.length; i++) { // 인덱스 0 1 2 3개
					System.out.printf("%d.%-8s%7d원\n", i + 1, menuArr[i], priceArr[i]);
				}
				System.out.println("================");

				// 메뉴선택
				System.out.print("메뉴 선택 : ");
				menu = scanner.nextInt();

				if (menu >= 1 && menu <= menuArr.length) { // 정상선택
					break;
				} else {
					System.out.println("잘못입력했습니다. 메뉴를 다시 선택해주세요!!");
				}
			}
			// 메뉴 선택 정상적으로 했다. ----------------

			// 메뉴 선택 완료
			// 수량 선택

			// 수량선택
			System.out.print("수량 선택 : ");
			count = scanner.nextInt();
			// 몇번 메뉴 선택 ? -> menu
			// 몇개 시켰지? -> count

			countArr[menu - 1] += count; // 선택한 메뉴번호-1 위치 인덱스에 수량 추가

			// 추가주문 여부 선택
			scanner.nextLine(); // 기존 입력값 (엔터) 청소용

			while (true) {
				System.out.print("추가주문 하시겠습니까?(y/n) : ");
				addOrder = scanner.nextLine();

				if (addOrder.equals("y") || addOrder.equals("n")) {
					break;
				} else {
					System.out.println("잘못입력했습니다. 추가주문여부(y/n) 다시 선택해주세요!!");
				}
			}

			if (addOrder.equals("n")) {
				// 최종 금액 보여주고 종료
				System.out.println("==========================");
				int total = 0;
				for (int i = 0; i < menuArr.length; i++) {
					if (countArr[i] > 0) {
						System.out.printf("%s %d잔 : %d원\n", menuArr[i], countArr[i], countArr[i] * priceArr[i]);
						total += countArr[i] * priceArr[i];
					}
				}

				// 총합 금액
				System.out.println("==========================");
				System.out.println("총액 : " + total + "원");

				break;
			}

		}
	}

}
