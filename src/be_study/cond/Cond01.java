package be_study.cond;

public class Cond01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		조건문 if문
//		if(조건식) 참 -> 실행
		
		int n = 10;
		if (n > 5) {
			System.out.println("n이 5보다 크다");
			System.out.println("if문 안에 실행");
			
			int y = 50;
		}
//		y = y - 5
//		y 변수는 if문 안에서만 정의된 변수
		int y = 5;
		
		if (n < 10) 
			System.out.println("n이 10보다 작다");
		else
			System.out.println("n이 10보다 작지 않네?");
		
		System.out.println("end");
		
		
//		if (조건식) 조건식 -> 결과가 논리형 (true/false)
		
		
		boolean bln = (n != 15);
//		if (!bln) (bln == true) (bln == false)
		if (bln) {
			System.out.println("15가 아냐");
		}
		else {
			System.out.println("15가 맞아");
		}
		
	}

}
