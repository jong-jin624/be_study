package be_study.refer;

public class Arr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Array 배열
		
		int score1 = 30;
		int score2 = 60;
		int score3 = 70;
		int score4 = 80;
		int score5 = 100;
		
		int sum = 0;
		sum = score1 + score2 + score3 + score4 + score5;
		double avg = sum / 5.0;
		
		System.out.println("총점: " + sum + " 평균: " + avg);
		
		
		sum=0;
		
		// 점수들~
		// scores scoreArr scoreArray
		int[] scoreArr = { 30, 60, 70, 80, 100 };
		//index			   0   1   2   3   4
		
		sum = scoreArr[0] + scoreArr[1] + scoreArr[2] + scoreArr[3] + scoreArr[4];
		avg = sum / 5.0;
		
		System.out.println("총점: " + sum + " 평균: " + avg);
		
		sum=0;
		for(int i=0; i<5; i++) {
//			sum = sum + scoreArr[i];
			sum += scoreArr[i];
		}
		
		System.out.println("총점: " + sum + " 평균: " + avg);
		
//		int[] pointArr; 단순선언
		int [] pointArr = null;
		pointArr = new int[] {30, 12, 10, 5, 1};
		
		pointArr = new int[5]; // 공간 명시
		
		pointArr[0] = 30;
		pointArr[1] = 12;
		pointArr[2] = 10;
		pointArr[3] = 5;
		pointArr[4] = 1;
		
		for (int i = 0; i<5; i++) {
			System.out.print(pointArr[i] + " ");
		}
		
		
		System.out.println();
		
		for(int i = 1; i<=5; i++) {
			pointArr[i-1] = i;
			System.out.print(i);
		}
		System.out.println();
		
		for (int i = 0; i<5; i++) {
			System.out.print(pointArr[i] + " ");
		}
		System.out.println();
		
		System.out.println(pointArr);
		
		int [] intArr = new int[6];
//		intArr = new int[] {1, 2, 3, 4, 5, 6};
		double[] doubleArr = new double[12];
//		doubleArr = new double[] {2.1, 2.2, -4.0, -5.0, -5.1, 0, 0, 0, 0, 0, 0, 0};
		String[] stringArr = new String[30];
		boolean[] booleanArr = new boolean[7];
		
		for(int i = 0; i< intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i<doubleArr.length; i++) {
			System.out.print(doubleArr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i<stringArr.length; i++) {
			System.out.print(stringArr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i<booleanArr.length; i++) {
			System.out.print(booleanArr[i] + " ");
		}
		System.out.println();
		
		
	}
}
