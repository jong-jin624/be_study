package be_study.test2;

public class RouletteGameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RouletteGame roulette = new RouletteGame("D2R3V1RA7", "대전룰렛");

		System.out.println("룰렛 게임 시작");
		boolean iWant = true;
		while (iWant) {
			switch (roulette.gameMenu()) {
			case 1:
				roulette.charge();
				break;

			case 2:
				roulette.gameStart();
				break;

			case 3:
				if (roulette.endGame() == true) {
					System.out.println("게임 종료");
					iWant = false;
					break;

				}
			}

		}

	}
}