package be_study.cls.cls03;

public class Calc {
	
//	메소드 계산기 Calculator
	
	void powerOn() {
		System.out.println("power On");
	}
	
	void setOwner(String name) {
		System.out.println(name + "님의 계산기로 등록되었습니다.");
	}
	
	int sum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / y;
		return result;
	}
	
	int checkBattery() {
		return 80;
	}
	
	String madeByInfo() {
		return "카시오";
	}
	
	
}
