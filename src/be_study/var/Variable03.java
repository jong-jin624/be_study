package be_study.var;

public class Variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		타입변환
		
//		int < double
		
		int i1 = 30;
		int i2 = i1;
//		int i3 = 3.11; 정수형 변수 = 실수형 값 X
		
		double d1 = 3.11;
		double d2 = d1;
		
		double d3 = 40; // 40 -> 40.0  int -> double
		double d4 = 40.0;
		
		System.out.println(d3);
		
		double d5 = i1; // 자동형변환	int -> double
		// 			30	-> 30.0
		
		char c1 = 'A';
		int i3 = c1;
		System.out.println(c1); // A
		System.out.println(i3); // 65
		
		char c2 = (char)i3; // (char)65
		System.out.println(c2); // A
		
		double dd1 = 12.34;
		int li1 = (int)dd1; // 강제 타입 변환
		System.out.println(li1); // 12 반올림도 안하고 소숫점부터는 버림
		
//		java 정수 -> int
//		java 실수 -> double
//		float f1 = (float)4.45;
		float f1 = 4.45f;
		double dd2 = f1; // flat < double 자동타입변환
		System.out.println(dd2);
		
//		연산에서 타입변환
		int i10 = 3;
		double d10 = 5;
//		int i11 = i10 + d10; int + double = double
//					3 + 5 = 8 -> 8.0
		double d11 = i10 + d10;
		
		
		int i12 = 10;
		double d12 = 5.5;
//		int i13 = i12 + d12;  15.5 double
		
		int i13 = (int)(i12 + d12); // 계산한 뒤 타입변환
		System.out.println(i13);
		
		double dv1 = 5.5;
		double dv2 = 6.6;
		int result = (int)dv1 + (int)dv2; // 5 + 6
		System.out.println(result); // 11
//		괄호에 따라 계산이 다름
		result = (int)(dv1 + dv2); // 5.5 + 6.6 12.1
		System.out.println(result); // 12
//		백엔드에서는 작은 수치도 중요 정확하게
		
		int x =1;
		int y = 2;
		double result2 = x / y; // int / int = int
		
		result2 = (double)x / y;
		System.out.println(result2);
		result2 = x / (double)y;
		System.out.println(result2);
		result2 = (double)x / (double)y;
		System.out.println(result2);
		
		result2 = 1/2;
		System.out.println(result2);
		result2 = (double)1/2;
		System.out.println(result2);
		result2 = 1/2.0;
		System.out.println(result2);
	}

}
