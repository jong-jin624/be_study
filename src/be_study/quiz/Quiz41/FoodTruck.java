package be_study.quiz.Quiz41;

import java.util.ArrayList;
import java.util.List;

class FoodTruck {
	List<Food1> menu = new ArrayList<>();
	int totalSales = 0;

	void addMenu(Food1 food) {
		menu.add(food);
	}

	void showMenu() {
		for (Food1 f : menu) {
			System.out.println(f.name + " / " + f.price + "원 / 재고: " + f.inven);
		}
	}

	void order(String name, int count) {
		for (Food1 f : menu) {
			if (f.name.equals(name)) {
				if (f.inven >= count) {
					f.inven -= count;
					totalSales += f.price * count;
					System.out.println("주문 완료! +" + (f.price * count));
				} else {
					System.out.println("재고 부족!");
				}
				return;
			}
		}
		System.out.println("없는 메뉴!");
	}

	public void addInven(String name, int count) {
		for (Food1 f : menu) {
			if (f.name.equals(name)) {
				f.addInven(count);
				System.out.println(name + " 재고 +" + count);
				return;
			}
		}
		System.out.println("없는 메뉴입니다.");
	}

	void close() {
		int loss = 0;
		for (Food1 f : menu) {
			int leftover = f.inven;
//            loss += leftover * (int) (f.price * 0.3);
			loss += (int) (f.inven * 0.3 * f.price);

		}
		System.out.println("폐기 손해: " + loss);
		System.out.println("최종 매출: " + (totalSales - loss));
		System.out.println("마감 종료");
	}
}