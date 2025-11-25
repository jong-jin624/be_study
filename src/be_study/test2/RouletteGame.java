package be_study.test2;

import java.util.Scanner;

public class RouletteGame {
	String deviceId;
	String spot;
	int sumPoint;
	int success;
	int failures;
	int moreTry;
	int totalSales;

	public RouletteGame(String deviceId, String spot) {
		this.deviceId = deviceId;
		this.spot = spot;
		this.sumPoint = 0;
		this.success = 0;
		this.failures = 0;
		this.moreTry = 0;
		this.totalSales = 0;
	}

	public int gameMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("메뉴를 선택하세요(1.금액충전 2.게임시작 3.게임종료) : ");
		int chooseMenu = scanner.nextInt();

		if (chooseMenu < 1 || chooseMenu > 3) {
			System.out.println("잘못 선택하셨어요 1~3까지 선택해주세요.");
		}
		return chooseMenu;
	}

	public void charge() {
		if (moreTry >= 1) {
			System.out.println("아직 라운드가 남아서 추가 충전 할 수 없습니다 !!!");
			System.out.println("게임을 진행하세요 ~");
			return;
		}
		Scanner chargeMoney = new Scanner(System.in);
		System.out.print("충전할 금액을 입력하세요(1000원 2회) : ");
		int chargedMoney = chargeMoney.nextInt();
		int round = chargedMoney / 500;
		if (chargedMoney < 1000) {
			System.out.println("500원 동전은 넣을 수 없습니다. 1000원(지폐) 이상 충전해주세요.");
		} else {
			moreTry = round;
			System.out.println(chargedMoney + "원 충전 확인됐습니다. " + round + "라운드 진행 하실 수 있습니다.");
			totalSales += chargedMoney;
		}
	}

	public void gameStart() {
		if (moreTry <= 0) {
			System.out.println("충전하지 않았습니다.");
			return;
		}

		System.out.println("========== 룰렛 스타트 ===========");
		while (moreTry > 0) {

			int randomRoulette = (int) (Math.random() * 6) + 1;
			if (randomRoulette <= 4) {
				System.out.printf("성공&점수 : ", randomRoulette);
				success++;
				sumPoint += randomRoulette;
				moreTry--;
			} else {
				System.out.printf("실패입니다.");
				failures++;
				moreTry--;
			}
			System.out.printf("성공횟수: %d 실패횟수: %d 총합점수: %d\n", success, failures, sumPoint);
		}
		System.out.println("=========== 룰렛 종료 ==========");
		System.out.println("라운드가 종료됐습니다. 더 플레이 하시겠습니까 ?");
		success = 0;
		failures = 0;
		sumPoint = 0;
	}

	public boolean endGame() {
		if (moreTry >= 1) {
			System.out.println("... 아직 라운드가 남아서 종료할 수 없습니다 ...");
			return false;
		}

		System.out.println("최종 마감 매출액 : " + totalSales);
		return true;
	}

}
