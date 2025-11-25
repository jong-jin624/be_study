package be_study.quiz.LikeTest;

public class Food {// 2
	String name; // 이름     
	int price; // 가격
	int stock = 5; // 재고

	//3
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	// 4재고 설정

	// 1. 그냥세팅 setStock(5)
	public void setStock(int stock) {
		this.stock = stock;
	}

	// 2. 재고가 변경이 된다. 재고조정(-2)
	// 재고조정(20)

	public void modifyStock(int count) {

		if (stock + count < 0) {
			stock = 0;
		} else {
			stock += count;
		}
	}
	//5
	public String getFoodInfo() {
		return String.format("%s : %d원 (잔여재고:%d)", name, price, stock);
	}

}
