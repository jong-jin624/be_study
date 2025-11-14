package be_study.quiz.Quiz27;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor m1 = new Monitor("삼성", 27, 150000);
		Monitor m2 = new Monitor("LG", 32, 330000);

		m1.setColor("검은색");
		m2.setColor("흰색");

		m1.resolution(1080, 780);
		m2.resolution(4096, 2048);

		m1.powerOn();
		m2.powerOn();
		
		m1.printInfo();
		m2.printInfo();

		m2.raisePrice(70000);
		System.out.println("인상된 가격 : 70000");

		m1.printInfo();
		m2.printInfo();

	}

}
