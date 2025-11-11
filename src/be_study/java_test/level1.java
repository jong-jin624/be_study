package be_study.java_test;

import java.util.Scanner;

public class level1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int out = 0;
		int set = 1;
		int[] ball = new int [30];

		for (int i = 1; i <= 10; i++) {
			System.out.print("플레이어(타자)는 1~10까지 입력: ");
			int player = scanner.nextInt();
			
			ball[i] = (int) (Math.random() * 10) + 1;
			System.out.println("투수 : " + ball[i]);
			System.out.println("플레이어(타자) : " + player);
			if (ball[i] == player) {
				System.out.println("안타 !~~~ ");
			} else {
				System.out.println("아웃 !!!!!!!");
				out++;
			}
			if (out == 3) {
				if (set == 1) {
					System.out.println("==============================");
					System.out.println("1회가 끝났습니다. 2회 경기가 시작합니다 !");
					System.out.println("==============================");
				} else if (set == 2) {
					System.out.println("==============================");
					System.out.println("2회가 끝났습니다. 3회 경기가 시작합니다 !");
					System.out.println("==============================");
				} else {
					System.out.println("==============================");
					System.out.println("마지막 3회가 끝났습니다!");
					break;
				}
				set++;
				out -= 3;
			}
		}
		System.out.println("게임 종료입니다.");
	}

}
