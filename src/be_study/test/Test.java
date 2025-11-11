package be_study.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);

		int[] c1 = new int [5];
		int[] c2 = new int [5];
		int[] c3 = new int [5];
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
		int avg = 0;
		int allAvg = 0;
		
		System.out.print("1반 5명에 학생의 점수는 ? : ");
		for (int i = 0; i<c1.length; i++) {
			c1[i] = scanner.nextInt();
			total1 += c1[i];
			if(i==4) {
				avg = total1 / 5;
			}
		}
		for (int i = 0; i<c2.length; i++) {
			c2[i] = scanner.nextInt();
			total2 += c2[i];
			if(i==4) {
				avg = total2 / 5;
			}
		}
		for (int i = 0; i<c3.length; i++) {
			c3[i] = scanner.nextInt();
			total3 += c3[i];
			if(i==4) {
				avg = total3 / 5;
			}
		}
		avg = (total1 + total2+ total3) / 15; 
		
		for(int i=0; i)
		System.out.println("");
    }
}
		
		
