package be_study.java_test;

import java.util.Scanner;

public class level3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		boolean threeOut = false;
		int out = 0;
		int set = 1;
		int[] ball = new int[30];
//		String[] name = new String [9];
		String[] name = new String[] { "빨강", "주황", "노랑", "초록", "파랑", "보라", "검은", "흰색", "분홍" };

		for (int i = 1; i <= 9; i++) {
			if (threeOut == true) {
				break;
			}
			System.out.println(i + "번 타자 " + name[i - 1] + "선수 등장!~~~~~");
			for (int j = 1; j <= 10; j++) {

				System.out.print("플레이어(타자)는 1~10까지 입력: ");
				int player = scanner.nextInt();
				ball[j] = (int) (Math.random() * 10) + 1;
				System.out.println("투수 : " + ball[j]);
				System.out.println("플레이어(타자) : " + player);
				if (ball[j] == player) {
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
						threeOut = true;
						break;
					}
					set++;
					out -= 3;
					break;
				}
			}

		}
		System.out.println("게임 종료입니다.");

	}

}
