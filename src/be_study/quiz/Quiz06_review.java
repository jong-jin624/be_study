package be_study.quiz;

import java.util.Scanner;

public class Quiz06_review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
		Scanner scanner = new Scanner(System.in);
		System.out.print("밑변 입력: ");
		int a = scanner.nextInt();
		System.out.print("높이 입력: ");
		int b = scanner.nextInt();
		
		
		System.out.println("삼각형의 넓이: " + ((double)a * b / 2) );
		System.out.println("삼각형의 넓이: " + (a * b / 2.0) );

		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
		System.out.print("윗변 입력: ");
		int a2 = scanner.nextInt();
		System.out.print("밑변 입력: ");
		int b2 = scanner.nextInt();
		System.out.print("높이 입력: ");
		int c2 = scanner.nextInt();
		double d2 = (a2 + b2) * c2 / 2.0;
		
		System.out.println("사다리꼴의 넓이: " + d2);
		
		
		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.
		int a3 = 24;
		int b3 = 100;
		System.out.println("한명당 나눠받는 과자 수: " + b3 / a3 );
		System.out.println("남은 과자 수: " + b3 % a3 );
		
		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8
		System.out.print("세자리의 정수 입력: ");
		int num = scanner.nextInt();
		System.out.println("백의자리: " + (num % 1000) / 100 );
//		System.out.println("십의자리: " + (num % 100) / 10 );
		System.out.println("십의자리: " + (num / 10) % 10 );
		System.out.println("일의자리: " + num % 10 );
		
		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
		int x = 10;
		int y = 20;
		System.out.println("x="+x+ " y="+y);
//		//x와 y를 바꾼 작업
		int temp = x;
		x = y;
		y = temp;
		

		System.out.println("x="+x+ " y="+y);
	}

}
