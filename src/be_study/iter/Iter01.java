package be_study.iter;

public class Iter01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		
//		int i = 0; for문보다 먼저 변수 초기화하면 문제됨
//		for문 초기화식; 조건식; 증감식;    
		for( int i=1; i<=10; i++ ) {
			System.out.println("즐겁다 ! " + i);
//		초기화식은 처음 한번만
//		조건문이 참이면 실행하고 증감 반복 
//		끝나는 시점은 조건문이 거짓이 됐을 때
		} 
		
		int i = 0;
		
		for (i=1; i<3; i++) {
			System.out.println("화요일");
		}
		
		for (i=35; i<45; ++i) {
			System.out.println("실행문1");
		} System.out.println(i);
		
		for(int j=10; j>5; j--) {
			System.out.println("다이어트 1일차");
		}
		
		for(int j= 1; j<6; j++) {
			System.out.println("다이어트" + j + "일차");
		}
		
		int sum = 0;
		
		for(int n=1; n<=100; n++) {
//			sum = sum + n;
			sum += n;
		} System.out.println("최종합: " + sum);
		
		// 10 20 30 40 50 ... 100 의 합
		int ten = 0;
		for (int n=10; n<=100; n += 10) {
//			System.out.println(ten + n);
			ten += n;
//			System.out.println(ten);
		} System.out.println(ten);
		
		int total = 0;
		for(int k=10; k<=100; k=k+10) {
			total = total + k;
		} System.out.println(total);
		
		total = 0;
		for(int k=1; k<=10; k++) {
//			total += k*10;
			total = total + (k*10);
		}
		System.out.println(total);
		
		
		for (int k=2; k<20; k=k*2) {}
//		2 4 8 16?
		
		for (int k=400; k>100; k=k-50) {}
//		400 350 300 250 200 150
		
		for (int k=100; k>=90; k--) {}
//		100 99 98 97 .. 90
		
		// 짝수 출력
		for (int j = 2; j <= 10; j += 2) {
		    System.out.println(j);
		}
		
//		for (int j = 1; j <= 10; j++) {
//			if (j % 2 == 0)
//			System.out.println(j);
//		}
		
		
		// 홀수 출력
		for (int j = 1; j <= 11; j += 2) {
		    System.out.println(j);
		}
		
//		for (int j = 1; j <= 11; j++) {
//			if (j % 2 == 1)
//			System.out.println(j);
//		}
	}

}
