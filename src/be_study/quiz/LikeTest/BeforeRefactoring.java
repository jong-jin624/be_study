package be_study.quiz.LikeTest;

import java.util.ArrayList;
import java.util.Scanner;

public class BeforeRefactoring {

	String truckName; // 트럭이름
	int totalSales; // 총매출액
	boolean isOpened; // 영업중 여부

	// 푸드트럭은 판매하는 푸드종류(메뉴) 여러개 가지고 있다
	ArrayList<Food> foodList;

	public BeforeRefactoring() {
		truckName = null;
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}

	public BeforeRefactoring(String truckName) {
		this.truckName = truckName;
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}

	public void addMenu(Food food) {
		foodList.add(food);
	}

	public void addMenu(String name, int price) {
		Food food = new Food(name, price);
		foodList.add(food);
	}

	public void startSales() {

		// 영업시작 ~ 장사시작~
		isOpened = true;
		System.out.println("=======[" + truckName + " 푸드트럭 영업시작 ]=======");

		Scanner scanner = new Scanner(System.in);

		while (isOpened) {

			System.out.println();
			System.out.println("***[메뉴선택]***");
			System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
			System.out.print(">>> 입력 : ");

			int menuInput = scanner.nextInt();

//			if(menuInput == 1) {
//			} else if(menuInput == 2) {
//			}

			switch (menuInput) {
			case 1: // 메뉴보기
				// 인덱스 : 0 1 2 3 ...
				// 사용자 메뉴 번호 : 1 2 3 4 ...

				System.out.println();
				System.out.println("-------[메뉴]-------");
				for (int i = 0; i < foodList.size(); i++) {
					System.out.printf("[%d] %s\n", i + 1, foodList.get(i).getFoodInfo());
				}
				break;
			case 2: // 주문하기

				System.out.println();
				System.out.println("-------[메뉴]-------");
				for (int i = 0; i < foodList.size(); i++) {
					System.out.printf("[%d] %s\n", i + 1, foodList.get(i).getFoodInfo());
				}
				// 몇번 메뉴 주문할래?
				System.out.print(">>> 주문 메뉴 번호 입력 : ");
				int orderMenu = scanner.nextInt();
				// 몇개 주문할래? 생략 -> 1개 주문

				// 주문번호 1 2 3 ... 인덱스 0 1 2
				// orderMenu -> 인덱스 역할 orderMenu - 1

				int orderMenuIndex = orderMenu - 1;
				if (foodList.get(orderMenuIndex).stock > 0) {
					// 재고 변경
					// 금액만큼 매출액 증가
					foodList.get(orderMenuIndex).modifyStock(-1); // 1개주문만큼 재고감소

					totalSales += foodList.get(orderMenuIndex).price; // 매출액 증가

					System.out.printf("[주문정보] %s 메뉴 %d개 주문완료! \n", foodList.get(orderMenuIndex).name, 1);

				} else {
					System.out.println("[품절안내] 해당 메뉴는 품절입니다.");
				}

				break;
			case 3: // 재고관리

				System.out.println();
				System.out.println("-------[메뉴]-------");
				for (int i = 0; i < foodList.size(); i++) {
					System.out.printf("[%d] %s\n", i + 1, foodList.get(i).getFoodInfo());
				}

				System.out.print(">>> 재고 관리할 메뉴 번호 입력 : ");
				int input = scanner.nextInt();
				System.out.print(">>> 재고 조정할 개수를 입력 : "); // 10 + 5
				int stockCount = scanner.nextInt();
				foodList.get(input - 1).modifyStock(stockCount);
				// 몇번인덱스에 있는 메뉴에게 너의 재고를 stockCount만큼 조정해라
				System.out.println("[재고 조정 적용]");
				System.out.println(foodList.get(input - 1).getFoodInfo());
				System.out.println();

				break;
			case 4: // 마감하기
				System.out.println();
				System.out.println("=====[영업마감]=====");
				isOpened = false;
				// 매출
				// 남은재고 원가 %차감 (판매금액의 30%)
				int lossSales = 0;
				for (Food food : foodList) {
					lossSales += (food.price * 0.3 * food.stock);
				}

				// 수익 얼마~
				System.out.println("----[마감정보]----");
				System.out.println(">>> 총매출액 : " + totalSales);
				System.out.println(">>> 원가차감 : " + lossSales);
				System.out.println(">>> 최종수익 : " + (totalSales - lossSales));

				break;
			}

		}
	}
}

/*
 * 푸드트럭 - 푸드트럭은 여러종류의 음식들을 메뉴로 가지고 있을 수 있다. - 각 음식들은 각각의 이름, 가격, 재고를 가지고 있다. -
 * 초기에 이름과 가격을 가지고 생성된다. - 각 음식별 재고를 설정할 수 있다. - 메뉴를 보여주는 기능(메뉴와 함께 주문가능한 재고까지)이
 * 있다. - 메뉴중 주문을 할 수 있으며, 주문 시 금액만큼 매출이 증가하고 재고가 떨어진다. - 재고가 없는 메뉴는 판매할 수 없다.
 * 
 * -기능 기준 (메뉴보기, 주문하기, 재고관리(메뉴 재고 추가), 마감하기)
 * 
 * - 마감시 남은 재고만큼 매출액이 마이너스된다. ※마이너스 금액은 각 음식의 가격의 30% 원가 - 마감시 당일 매출액을 보여주고
 * 종료됩니다.
 * 
 * 김밥 1000 재고 50개 40개 -> 40,000원 10개 ->마감 -> 3000 매출 4만 - 폐기손해3천 최종수익 37000원
 */