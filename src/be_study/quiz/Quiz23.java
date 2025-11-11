package be_study.quiz;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("엘리베이터 횟수 제한 ! : ");
			int count = scanner.nextInt();
			int countStop = 0;

			System.out.print("탑승 인원 : ");
			int people = scanner.nextInt();

			int[] floor = new int[people];
			int el = 100;

			System.out.print("이동할 층을 입력하세요 : ");
			for (int i = 0; i < floor.length; i++) {

				floor[i] = scanner.nextInt();
			}
			scanner.nextLine();
			System.out.println();

			boolean check = false;

			for (int i = 1; i <= el; i++) {
				System.out.println("..... 현재 " + i + "층입니다. .....");
				for (int j = 0; j < floor.length; j++) {
					if (countStop == count && count == i) {
						System.out.println("전력 공급 한계로 인해 남아 있는 " + "손님분들은 계단으로 이동해주시길 바랍니다.");
						System.out.println(".........." + (i) + "층 점검중 ..........");
						check = true;
						break;
					} else if (floor[j] == (i)) {
						System.out.println(floor[j] + "층입니다. 선택하신 손님 내리시면 됩니다.");
						boolean moved = false;
						countStop++;

						while (!moved) {
							System.out.println("선택하신 층에서 내리셨으면 이동하겠습니다. (y/n)");
							String move = scanner.nextLine();
							if (move.equals("y")) {
								moved = true;
							} else {
								System.out.println("..... 전부 층에서 내리실동안 기다리겠습니다 .....");
							}
						}

					}
				}

			}
			if (check) {
				break;
			}

			boolean moved = false;
			while (!moved) {
				System.out.println("모두 층에서 내리셨으면 다시 1층으로 이동하겠습니다. (y/n)");
				String move = scanner.nextLine();
				if (move.equals("y")) {
					System.out.println("~~~~~ 1층에 도착했습니다. ~~~~~");
					moved = true;
				}
			}
			System.out.println();
			continue;
		}
	}

}
