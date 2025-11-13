package be_study.quiz.quiz25;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor m1 = new Monitor("삼성", "더프레임", 65);
		Monitor m2 = new Monitor("LG", "올레드", 80);
		
		m1.print();
		System.out.println("--------------------------");
		m2.print();
	}

}
