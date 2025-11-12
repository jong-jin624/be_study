package be_study.quiz;

import java.util.Scanner;

public class Quiz23_lvl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("탑승 인원 수 입력 : ");
		int personCount = scanner.nextInt(); // 탈 사람 수
		// 10 5

		int[] destFloorArr = new int[personCount]; // 사람 수많큼 층수 입력을 저장할 배열 생성
		System.out.print("목적지 층수 입력(2~100) : ");
		for (int i = 0; i < destFloorArr.length; i++) {
			destFloorArr[i] = scanner.nextInt();
			// 2~100 층 필터링 예외처리
		}
		
		System.out.print("최대 멈춤 횟수 입력 : ");
		int maxStopCount = scanner.nextInt();
		
		
		/*
		 * //v1 : 1->100->1 //v2 : 1-> 입력한 층수 중에 최고층까지만 갔다가 -> 1 //destFloorArr 에서 최대값
		 * 찾기 이후 진행 //maxFloor //for(int i=1; i<=maxFloor; i++) for(int i=1; i<=100;
		 * i++) { //올라갈때 몇층에 멈출것인가? System.out.println(i + "층"); //멈춰야 하는 층 정보 :
		 * destFloorArr 10 35 55
		 * 
		 * for(int j=0; j<destFloorArr.length; j++) { //현재 층이 목적지 층에 속해있는가? if(i ==
		 * destFloorArr[j]) { //멈춰야 하는 층이 맞다! System.out.println("***도착 (승객하차)***"); } }
		 * }
		 * 
		 * for(int i=100; i>=1; i--) { // 내려오기. 100 -> 1 System.out.println(i + "층"); }
		 */

		// 진행 방향을 별도의 변수로 처리 boolean flag 변수
//		int floor = 1; //현재 층수
//		boolean isUp = true; //flag 역할  true 올라가는 방향 / false 내려가는 방향
//		
//		while(true) {
//			System.out.println(floor + "층");
//			
//			//내릴 층인가?
//			if(floor >= 100) {
//				isUp = false;
//			}
//			
//			//100층 올라갔다가 다시 1층으로 내려오면 끝.
//			if(floor <= 1 && isUp == false) { //내려오는 방향으로 1층일때 끝
//				break; //끝.
//			}
//			
//			if(isUp)  //isUp true -> 올라가는중 +1
//				floor++; // 1-> 100 ++ 
//			else //isUp false -> 내려가는중 -1
//				floor--; // 100 -> 1  --
//		}

		int floor = 1; // 현재 층수
		int flow = 1; // flag 역할겸 층이 변하는 값 역할
		// flow : 1 -1 층이 변하는 연산에 값으로 참여 (층의 진행 방향을 의미)
		int stopCount = 0;

		while (true) {
			System.out.println(floor + "층");

			// 내릴 층인가?
			if (flow == 1) { // 올라갈때
				for (int j = 0; j < destFloorArr.length; j++) {
					// 현재 층이 목적지 층에 속해있는가?
					if (floor == destFloorArr[j]) { // 멈춰야 하는 층이 맞다!
						System.out.println("***도착 (승객하차)***");
						stopCount++;
					}
				}
			}

			if (floor >= 100) {
				flow = -1;
			}
			
			if(stopCount == maxStopCount) {
				System.out.println("==== 운영중지 (점겅중) ====");
				break;
			}

			// 100층 올라갔다가 다시 1층으로 내려오면 끝.
			if (floor <= 1 && flow == -1) { // 내려오는 방향으로 1층일때 끝
				break; // 끝.
			}

			floor += flow; // flow 1 +1 -1 -1
		}
	}

}
