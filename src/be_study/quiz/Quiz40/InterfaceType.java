package be_study.quiz.Quiz40;

public class InterfaceType {
	public static void main(String[] args) {
// 객체 생성
	Food food = new Food("족발", 19800);
	Electronics elec = new Electronics("에어팟", 199000);
	Clothing clothes = new Clothing("셔츠", 49900);
// 총합 계산
	int foodPrice = food.discountedPrice();
	int elecPrice = elec.discountedPrice();
	int clothesPrice = clothes.discountedPrice();
	int total = foodPrice + elecPrice + clothesPrice;
// 결과 출력
	System.out.printf("총합: %d원", total);
	}
}

interface Orderable {
	public int discountedPrice();
}

class Food implements Orderable {
	private String name;
	private int price;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 1. 오버라이딩을 통해, 음식 할인율을 적용하세요. */

	@Override
	public int discountedPrice() {
		// TODO Auto-generated method stub
		double sum = price * (1 - (double)10 / 100);
		return (int) sum;
	}

}

class Electronics implements Orderable {
	private String name;
	private int price;

	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 2. 오버라이딩을 통해, 전자기기 할인율을 적용하세요. */

	@Override
	public int discountedPrice() {
		// TODO Auto-generated method stub
		double sum = price * (1 - (double)20 / 100);
		return (int) sum;
	}

}

class Clothing implements Orderable {
	private String name;
	private int price;

	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 3. 오버라이딩을 통해, 의류 할인율을 적용하세요. */

	@Override
	public int discountedPrice() {
		// TODO Auto-generated method stub
		double sum = price * (1 - (double)30 / 100);
		return (int) sum;
	}

}
