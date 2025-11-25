package be_study.quiz.Quiz41;


public class Food1 {
	String name;
	int price;
	int inven;

	Food1(String name, int price) {
		this.name = name;
		this.price = price;
		this.inven = 0;
	}

	void addInven(int amount) {
		this.inven += amount;
	}
}