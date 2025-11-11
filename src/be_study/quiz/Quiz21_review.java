package be_study.quiz;

import java.util.Scanner;

public class Quiz21_review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] lotto = new int[6];
//		int index = 0;
//		boolean isDuplicated = false;
//
//		while (true) {
//
//			int value = (int) (Math.random() * 45) + 1;
//
//			for (int i = 0; i < index; i++) {
//				if (lotto[i] == value) {
//					isDuplicated = true;
//				}
//			}
//
//			if (isDuplicated) {
//
//			} else {
//				lotto[index] = value;
//				index++;
//			}
//
//		}
//
//		for (int i = 0; i < 6; i++) {
//			lotto[i] = (int) (Math.random() * 45) + 1;
//			for(int )
//		}
		Scanner scanner = new Scanner(System.in);

		System.out.println("3번 문제");
		int[][] scoreArr = new int[3][5];

		for (int i = 0; i < scoreArr.length; i++) {
			System.out.printf("%d반 : ", i + 1);
			for (int j = 0; j < scoreArr[i].length; j++) {
				scoreArr[i][j] = scanner.nextInt();
			}
		}
		
		int total = 0;
		int classTotal = 0;
		for (int i = 0; i < scoreArr.length; i++) {
			
			classTotal = 0;
			for (int j = 0; j < scoreArr[i].length; j++) {
				classTotal += scoreArr[i][j];
			}
			total += classTotal;
			System.out.println(i+1 + "반 평균 : " + (int)(classTotal/5.0));
		}
		System.out.println("전체 평균 : " + (int)(total/15.0));
		System.out.println();
		
		System.out.println("4번 문제");
		int [][] arr = {
				{10, 20, 30},
				{20, 30, 40},
				{30, 40, 50}
		};
		
		int[][] newArr = new int[4][4];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				newArr[i][j] = arr[i][j];
				
				newArr[i][3] += arr[i][j];
				newArr[3][j] += arr[i][j];
				newArr[3][3] += arr[i][j];
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%4d", newArr[i][j]);
			}System.out.println();
		}System.out.println();
		
		
	}
}
