package be_study.var;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = 10;
		
		boolean b1 = (num1 == num2);
		System.out.println(b1);
		System.out.println(num1 == num2);
		
		scanner.nextLine(); // 엔터 청소용
		
		String str1 = scanner.nextLine();
		String str2 = "햄버거";
		
		System.out.println(str1);
		System.out.println(str2);
//		boolean b2 = (str1 == str2); X 문자열 비교는 .equals 써야함
//		boolean b2 = (str1.equals(str2));
//		System.out.println(b2);
		
//		System.out.println(str1 == str2); X 문자열 비교는 .equals 써야함
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals("햄버거"));
		
	}

}
