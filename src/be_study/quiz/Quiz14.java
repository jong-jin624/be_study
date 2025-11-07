package be_study.quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("------------1번 문제------------");
		int[] arr = new int[5];
		System.out.print("5개의 정수 입력: ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.print("몇번째 수인가요? ");
		int result = scanner.nextInt();
		System.out.println("결과: " + arr[result - 1]);

		System.out.println();

		System.out.println("------------2번 문제------------");
		int[] arr1 = new int[5];
		System.out.print("5개의 정수 입력: ");

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scanner.nextInt();
		}
		System.out.print("결과 : ");
		for (int j = 4; j >= 0; j--) {
			System.out.print(arr1[j] + " ");
		}

		System.out.println();
		System.out.println();

		System.out.println("------------3번 문제------------");
//		int[][] arr2 = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16} };
		int[][] arr2 = new int[4][4];
		int num = 1;

		for (int i = 0; i <arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = num;
				num++;
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.printf("%3d", arr2[i][j]);
			}
			System.out.println();
		}

	}

}
