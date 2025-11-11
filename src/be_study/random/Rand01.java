package be_study.random;

import java.util.Arrays;
import java.util.Scanner;

public class Rand01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int count = 0;
		System.out.println("1번 문제");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6) {
					System.out.printf("(%d, %d) ", i, j);
					count++;
				}
			}
		}
		System.out.println();
		System.out.printf("주사위 합이 6인 모든 경우의 수는 %d번", count);

		System.out.println();
		System.out.println("========================================");

		System.out.println("2번 문제");
//		난수 (랜덤값) 뽑기 사용

//		Math.random() 0 < 랜덤값 < 1
//		(int)(Math.random()*갯수(범위)) + 시작숫자
//		(int)(Math.random()*10) + 1
//		System.out.println((int)(Math.random()*100) + 101);
//											 101부터~200

//		System.out.println( Math.random() );

//		int rand = (int)(Math.random()*45) + 1;

		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}
		}

		for (int i = 0; i < lotto.length; i++) {
			Arrays.sort(lotto);
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		System.out.println("========================================");
//		System.out.println((int)(Math.random()*45) + 1);

		System.out.println("3번 문제");
		int[][] scores = new int[3][5];
		int[] totals = new int[3];
		int allTotal = 0;

		for (int i = 0; i < 3; i++) {
			System.out.printf("%d반 : ", i + 1);
			for (int j = 0; j < 5; j++) {
				scores[i][j] = scanner.nextInt();
				totals[i] += scores[i][j];
			}
			allTotal += totals[i];
		}

		System.out.println();

		for (int i = 0; i < 3; i++) {
			System.out.printf("%d반 평균 : " + (totals[i] / 5) + "\n", i + 1);
		}

		System.out.println("전체 평균 : " + (allTotal / 15));
		System.out.println("========================================");

		System.out.println("4번 문제");
		int[][] arr = { { 10, 20, 30 }, { 20, 30, 40 }, { 30, 40, 50 } };
		int[] col = new int[3];
		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			int row = 0;

			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
				row += arr[i][j];
				col[j] += arr[j][i];
			}
			System.out.println(row);
			total += row;

		}
		for (int i = 0; i < col.length; i++) {
			System.out.print(col[i] + " ");
		}
		System.out.println(total);
	}

}
