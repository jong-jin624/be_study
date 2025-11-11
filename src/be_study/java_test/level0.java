package be_study.java_test;

import java.util.Scanner;

public class level0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int out = 0;
		int[] ball = new int [10];
		
		
		for(int i=1; i<=10; i++) {
			System.out.print("플레이어(타자)는 1~10까지 입력: ");
			int player = scanner.nextInt();
			
			ball[i] = (int)(Math.random()*10) + 1;
			System.out.println("투수 : "+ ball[i]);
			System.out.println("플레이어(타자) : " + player);
			if(ball[i] == player) {
				System.out.println("안타 !~~~ ");
				System.out.println("==============================");
			} else {
				System.out.println("아웃 !!!!!!!");
				System.out.println("==============================");
				out++;
			}
			if(out == 3) {
				break;
			}
		} 
		System.out.println("게임 종료입니다.");
		
	}

}
