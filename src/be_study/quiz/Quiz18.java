package be_study.quiz;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// 1번 문제
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// 2번 문제
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 3번 문제
		System.out.print("수를 입력하세요: ");
		int num = scanner.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println();

		// 4번 문제
		System.out.print("피라미드 입력: ");
		int star = scanner.nextInt();
		for (int i = 1; i <= star; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = star - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 5번 문제
		num = 0;
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			num += i;
			result += num;
		}
		System.out.printf("최종결과: %d", result);
		System.out.println();
		System.out.println();

		// 6번 문제
//		100 이상이 된 시점 누적합
//		숫자 몇까지 더해서 100이 넘었는지
		int result6 = 0;
		int num6 = 0;
		for (int i = 1; result6 < 100; i++) {
			if (i % 2 == 1) {
				result6 += i;
			} else {
				result6 -= i;
			}
			num6 = i;
		}
		System.out.println("100이상 시점의 누적합: " + result6); // 100
		System.out.println("100이상이 된 시점에 더한 마지막 숫자: " + num6); // 199

		int i = 1;
		int total = 0;
		while (true) {
			if(i%2==0) {
				total -= i;
			} else {
				total += i;
			}
			if(total >= 100) {
				break;
			}
			i++;
		}
		System.out.println("100이상 시점의 누적합: " + total); // 100
		System.out.println("100이상이 된 시점에 더한 마지막 숫자: " + (i));

	}
}
