package be_study.quiz.Quiz32;

import java.util.Arrays;

public class Level1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1번");
//		1. 정수 배열을 만들어 모든 요소를 출력하라.
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.print(arr1[0] + " ");
		System.out.print(arr1[1] + " ");
		System.out.print(arr1[2] + " ");
		System.out.print(arr1[3] + " ");
		System.out.print(arr1[4] + " ");
		System.out.print(arr1[5] + " ");
		System.out.print(arr1[6]);
		System.out.println();
		System.out.println();
		System.out.println("2번");
//		2. 길이 5짜리 int 배열을 만들고 2번 인덱스에 50을 넣어라.
		int[] arr2 = new int[5];
		arr2[2] = 50;
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("3번");
//		3. 배열의 길이를 출력하라.
		int[] arr3 = new int[8];
		System.out.println(arr3.length);
		System.out.println();
		System.out.println("4번");
//		4. 배열 요소들의 합계를 구해라.
		int[] arr4 = { 1, 2, 3, 4, 5 };
		int total = 0;
		for (int i = 0; i < arr4.length; i++) {
			total += arr4[i];
		}
		System.out.println(total);
		System.out.println();
		System.out.println("5번");
//		5. for 문으로 배열 요소들을 출력하라.
		int[] arr5 = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr5.length; i++) {
			System.out.print(arr5[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("6번");
//		6. int 배열을 매개변수로 받아 평균을 구하는 메서드를 만들어라.
		int[] arr6 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(average(arr6));
		System.out.println();
		System.out.println("7번");
//		7. 배열을 전달받아 가장 큰 값을 리턴하는 메서드를 만들어라.
		int[] arr7 = { 1, 22, 333, 777, 567, 456, 678 };
		System.out.println(maxValue(arr7));
		System.out.println();
		System.out.println("8번");
//		8. 배열을 전달받아 모든 요소를 1 증가시키는 메서드를 작성하라. (원본 변경 확인)
		int[] arr8 = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(arr8));
		System.out.println("배열 모든 요소 1씩 증가");
		System.out.println(Arrays.toString(plus(arr8)));
		System.out.println();
		System.out.println("9번");
//		9. 배열을 생성하는 메서드를 만들어라(길이를 받아서 0으로 채워진 배열 리턴).
		int[] result = Array(7);
		System.out.println(Arrays.toString(result));
		System.out.println();
		System.out.println("10번");
//		10. 배열을 전달하면 역순으로 뒤집어주는 메서드를 만들어라.
		int[] arr10 = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(arr10));
		System.out.println("배열 뒤집기");
		System.out.println(Arrays.toString(reverse(arr10)));
	}

// 메소드
//	6. int 배열을 매개변수로 받아 평균을 구하는 메서드를 만들어라.
	public static double average(int numbers[]) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}

		return (double) sum / numbers.length;
	}

//	7. 배열을 전달받아 가장 큰 값을 리턴하는 메서드를 만들어라.
	public static int maxValue(int nums[]) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
		}
		return max;
	}

//	8. 배열을 전달받아 모든 요소를 1 증가시키는 메서드를 작성하라. (원본 변경 확인)
	public static int[] plus(int nums[]) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] + 1;
		}
		return nums;
	}

//	9. 배열을 생성하는 메서드를 만들어라(길이를 받아서 0으로 채워진 배열 리턴).
	public static int[] Array(int length) {
		int[] arr9 = new int[length];
		return arr9;
	}

//	10. 배열을 전달하면 역순으로 뒤집어주는 메서드를 만들어라.
	
	public static int[] reverse(int nums[]) {
		int[] arr10 = { 1, 2, 3, 4, 5, 6, 7 };
		for (int i = nums.length; i > 0; i--) {
			arr10[nums.length-i]=nums[i-1];
			
		}
		return arr10;
	}

}
