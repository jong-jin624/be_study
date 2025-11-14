package be_study.quiz.Quiz27;

public class Monitor {
	String make;
	int inch;
	int price;
	String color;
	int maxX;
	int maxY;

	Monitor(String make, int inch, int price) {
		this.make = make;
		this.inch = inch;
		this.price = price;
		
//		this.maxX = 0;
//		this.maxY = 0;
//		this.color = null;
	}

	void setColor(String color) {
		this.color = color;
	}

	void powerOn() {
		System.out.println("전원 ON");
	}
	
	void resolution(int maxX, int maxY) {
		this.maxX = maxX;
		this.maxY = maxY;
	}

	int raisePrice(int raise) {
		this.price += raise;
		return this.price;
//		return this.price + raise; 리턴값만 40만 실제 값은 33만 출력
	}

	void printInfo() {
		System.out.println(make + " " + inch + "인치 " + price + " " + color + " " + maxX + " * " + maxY);
	}
}
