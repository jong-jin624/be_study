package be_study.quiz;

import java.util.Scanner;

public class Quiz23_review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("탑승 인원 수 입력 : ");
		int personCount = scanner.nextInt();
		
		int[] destFloorArr = new int[personCount];
		System.out.print("목적지 층수 입력 : ");
		for(int i=0; i<destFloorArr.length; i++) {
			destFloorArr[i] = scanner.nextInt();
			
		}
//		for(int i=1; i<=100; i++) {
//			System.out.println(i + "층");
//		
//			for(int j=0; j<destFloorArr.length; j++) {
//				if(i == destFloorArr[j]) {
//					System.out.println("***도착 (승객하차)***");
//				}
//			}
//		}
//		
//		for(int i=100; i>=1; i--) {
//			System.out.println(i + "층");
//		}
		
		int floor = 1;
		boolean isUp = true;
		
		while(true) {
			System.out.println(floor + "층");
			
			if(floor >= 100) {
				isUp = false;
			}
			
			if(floor <= 1 && isUp == false) {
				break;
			}
			
			if(isUp)
				floor++;
			else
				floor--;
		}
		
	}

}
