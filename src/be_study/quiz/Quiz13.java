package be_study.quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 윤년이란? 지구가 태양을 한 번 공전하는 데 걸리는 시간을 일 년으로 두었는데, 사실은 그 시간이 365일이 아닌 365일 5시간 49분
		 * 가량이다. 일 년에 5시간 49분씩 4 년이 지나면 약 하루가 되는데, 이를 맞추기 위해 4 년마다 한 번씩 2월을 하루 늘리고 이를
		 * 윤년이라 한다. 단, 이렇게 계산하게 되면 매년 11분 가량이 초과되어 계산된다. 이는 131년이 지나면 하루(대략 400년에 3일)가
		 * 되기 때문에 대부분의 국가에서 반영하는 그레고리력에서는 400년에 3일을 제외시키기 위해 100년마다 한 번 윤년을 없애고 400년 마다
		 * 다시 하루를 추가해 윤년을 둔다. 정리하면 다음과 같은 방법으로 윤년을 계산할 수 있다.
		 * 
		 * ☞ 연도가 4로 나누어 떨어지면 윤년이다. ex) 2020년, 2024년, 2028년, ... ☞ 연도가 100으로 나누어 떨어지면 윤년이
		 * 아니다. ex) 2100년, 2200년, 2300년, ... ☞ 연도가 400으로 나누어 떨어지면 윤년이다. ex) 2000년,
		 * 2400년, 2800년, ...
		 * 
		 * 예를 들면 2000년은 100의 배수이지만 400으로 나누어 떨어지기 때문에 윤년이다.
		 * 
		 * 년도를 입력받아서 윤년인지 아닌지의 여부를 출력하세요
		 */

		// if, else if 사용할 때
		// 중요도 순으로 조건문 작성 : 400 > 100 > 4 > else
		// if 만 사용할 때는 상관없음

		Scanner scanner = new Scanner(System.in);
		System.out.print("년도를 입력하세요 : ");
		int year = scanner.nextInt();

		if (year % 400 == 0) {
			System.out.println("입력하신 " + year + "년도는 윤년입니다.");
		} else if (year % 100 == 0) {
			System.out.println("입력하신 " + year + "년도는 윤년이 아닙니다.");
		} else if (year % 4 == 0) {
			System.out.println("입력하신 " + year + "년도는 윤년입니다.");
		} else {
			System.out.println("입력하신 " + year + "년도는 윤년이 아닙니다.");
		}

		
		
//		1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		System.out.print("정수를 입력하세요: ");
		int num1 = scanner.nextInt();
		if (num1 % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

		
//		2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.

		System.out.print("정수를 입력하세요: ");
		int num2 = scanner.nextInt();
		if (num2 % 7 == 0) {
			System.out.println("7의 배수입니다.");
		} else {
			System.out.println("7의 배수가 아닙니다.");
		}

		
//		3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.

		int fiveK = 0;
		for (int i = 1; i <= 1000; i++) {

			if (i % 5 == 0)
				fiveK += i;
		}
		System.out.println("5의 배수의 합은 : " + fiveK);

		// 방법 2 증감식을 수정, if 문 제거
		fiveK = 0;
		for (int i = 5; i <= 1000; i += 5) {
			fiveK += i;
		}
		System.out.println("5의 배수의 합은 : " + fiveK);

		
//		4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
//		ex) 입력 : 10
//		결과 : **********

		System.out.print("1~50 까지의 수를 입력하세요: ");
		int star = scanner.nextInt();

//		for (int i = star; i >= 1; i--) {
		for (int i = 1; i <= star; i++) {
			System.out.print("*");
		}
		System.out.println();

//		5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
//		ex) 1 - 2 + 3 - 4 .....
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				total -= i;
			} else {
				total += i;
			}
		}
		System.out.println("최종결과: " + total);

//		6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
//		1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
		int total6 = 0;
//		for (int i = 1;; i++) {
//			total6 += i;
//			if (total6 >= 1000) {
//				total6 -= i;
//				break;
//			}
//		}
		
		for(int i = 1; i<=1000; i++) {
			
			if(total6 < 1000) {
				total6 = total6 + i;
				System.out.println(i);
			} 
		}
		System.out.println("1~1000까지 합 멈추는 시점: " + total6);

		total6 = 0;
		int i = 1;
		
		// 강사님 픽
		while(true) {
			total6+=i;
			i++;
			
			if(total6 >= 1000) {
				break;
			}
		}
		System.out.println(total6);
		
		total6 = 0;
		i=1;
		while(total6<1000) {
			total6+=i;
			i++;
		}
		System.out.println(total6);
		
		
		
//		7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
//		ex) 입력 3
//		3 * 1 = 3
//		3 * 2 = 6
//		3 * 3 = 9
//		...
//		3 * 9 = 27

		System.out.print("구구단 입력: ");
		int table = scanner.nextInt();

		for (i = 1; i <= 9; i++) {
			System.out.println(table + " * " + i + " = " + table * i);
		}

	}

}
