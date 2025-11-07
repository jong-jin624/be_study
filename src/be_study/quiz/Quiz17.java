package be_study.quiz;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("1번 문제-----------------------");
		// 불필요한 계산 없애는 조건식 팁
		// 2*x > 10 4*y > 10
		
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
//				불필요한 계산 없애는 조건문 팁
//				if(2*x + 4*y >10) {
//					break;
//				}
				if (2 * x + 4 * y == 10) {
					System.out.println("x:" + x + " y:" + y);
				}
				
			}
		}

		System.out.println();
		System.out.println("2번 문제--------------------------");

		System.out.print("정수 2개 입력 : ");
		int teger1 = scanner.nextInt();
		int teger2 = scanner.nextInt();

		if (teger1 > teger2) {
			System.out.printf("%d - %d = %d입니다.", teger1, teger2, teger1 - teger2);
		} else {
			System.out.printf("%d - %d = %d입니다.", teger2, teger1, teger2 - teger1);
		} System.out.println();
		

		
		System.out.println();
		System.out.println("3번 문제--------------------------");
		int result = 0;
		int[] yut = new int[4];
		System.out.print("4개의 윷 입력 : ");

		for (int i = 0; i < yut.length; i++) {
			yut[i] = scanner.nextInt();
			result += yut[i];	
		}
		
//		for (int j = 1; j <= 4; j++) {
//			result += yut[j - 1];	
//		}
		if (result == 4) {
			System.out.println("결과 : 윷");
		} else if (result == 3){
			System.out.println("결과 : 걸");
		} else if (result == 2){
			System.out.println("결과 : 개");
		} else if (result == 1){
			System.out.println("결과 : 도");
		} else {
			System.out.println("결과 : 모");
		}

		
		System.out.println();
		System.out.println("4번 문제----------------------");
		
		System.out.print("별 갯수 입력: ");
		int star = scanner.nextInt();
		
		for (int i = 1; i<=star; i++) {
			System.out.print("*");
		}
		
	}

}
