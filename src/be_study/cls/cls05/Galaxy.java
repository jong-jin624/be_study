package be_study.cls.cls05;

public class Galaxy {

	String owner;
	String model;
	
	static String madeBy = "삼성";
	
	
	void showInfo() {
		System.out.println(owner + "님의 " + model + " 상품 입니다.");
	}
	
	static void showMadeBy() {
		System.out.println(madeBy + "에서 만든 갤럭시 상품입니다.");
	}
	
}
