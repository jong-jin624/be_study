package be_study.var;

import java.util.Scanner;

public class Variable05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1);
		System.out.println(2);
		
		String s1 = "text test";
		System.out.println(s1);
		
		System.out.print(1);
		System.out.print(2);
		System.out.print("\n");
		
		System.out.println();
	
		
		int hour = 15;
		int minute = 2;
		
		System.out.println("현재 시간은 " + hour + "시 " + minute + "분 입니다.");
		System.out.printf("현재 시간은 %d시 %d분 입니다.\n" , hour, minute);
		
		String menu = "밥버거";
		System.out.printf("오늘 점심 메뉴는 %s입니다.\n", menu);

		double rate = 3.4612;
		System.out.printf("오늘 기준 이자율은 %.4f%% 입니다.\n", rate);
//		%.4f : 소숫점 4자리까지 출력  
//		%% : 실수 출력할때 %를 출력하고싶으면 두번 입력
		System.out.printf("오늘 기준 이자율은 %10.4f%% 입니다.\n", rate);
		System.out.printf("오늘 기준 이자율은 %-10.4f%% 입니다.\n", rate);
//		글자 수 10을 채우기 위해 왼쪽 혹은 오른쪽에 공백을 생성
		
//		입력 받기 Scanner
		Scanner scanner = new Scanner(System.in);
		
//		int 정수형 scanner.nextInt()
//		double 실수형 scanner.nextDouble()
//		String 문자열 scanner.nextLine()
		
		System.out.print("정수형 숫자를 입력하세요 : ");
		int number = scanner.nextInt();
		System.out.printf("당신이 입력한 숫자는 %d 입니다.\n", number);
		
		System.out.print("실수형 숫자를 입력하세요 : ");
		double number2 = scanner.nextDouble();
		System.out.printf("당신이 입력한 숫자는 %f입니다.\n", number2);
		
		scanner.nextLine(); // 청소용 (이전에 남은 찌꺼기 엔터(\n) 처리용
		
		System.out.print("문자열을 입력하세요 : ");
		String str =  scanner.nextLine();
		System.out.println("입력한 문자열 : " + str);
	}

}
