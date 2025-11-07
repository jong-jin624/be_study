package be_study.quiz;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String[] stringArr = new String[] { "입력", "수정", "조회", "삭제", "종료" };

		while (true) {
			for (int j = 1; j < stringArr.length + 1; j++) {
				System.out.println(j + ". " + stringArr[j - 1]);
			}
			System.out.print("   메뉴 번호를 입력하세요 : ");
			int menu = scanner.nextInt();

			if (menu == 5) {
				System.out.printf("   프로그램이 종료됩니다.");
				break;
			} else if (menu >= 1 && menu <= 5) {
//			System.out.print("   " + stringArr[i - 1] + " 메뉴입니다. ");
				System.out.printf("%5s 메뉴입니다.", stringArr[menu - 1]);
				System.out.println();
				System.out.println();
			} else {
				System.out.println("   잘못 입력하셨습니다.");
				System.out.println();
			}
		}

	}

}

