package be_study.quiz;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int scoreK = scanner.nextInt();
		System.out.print("수학점수 : ");
		int scoreM = scanner.nextInt();
		System.out.print("영어점수 : ");
		int scoreE = scanner.nextInt();
		
		int total = scoreK + scoreM + scoreE;
		double avg = total / 3;
		
		if(scoreK >= 40 && scoreM >= 40 && scoreE >= 40 && avg >= 60) {
			System.out.println("국어 : "+ scoreK);
			System.out.println("수학 : "+ scoreM);
			System.out.println("영어 : "+ scoreE);
			System.out.println("합계 : "+ total);
			System.out.println("평균 : "+ avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다."); 
		}
	}

}
