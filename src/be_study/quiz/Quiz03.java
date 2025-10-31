package be_study.quiz;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 아래 1), 2) 에 맞게 풀이.
		int x = 10;
		int y = 4;
		int result = x/y;
		System.out.println(result);
		double result1 = (double)x / y;
		System.out.println(result1);

//	2. 결과가 7.5가 나오도록 작성하세요
	double a = 3.5;
	double b = 4.7;
	double result2 = a + (int) b;
	System.out.println(result2);
		
//	3. 계산결과가 12가 나오도록 작성하세요
	String c = "3.4";
	String d = "4";
	double e = Double.parseDouble(c);
	int result3 = (int)e * Integer.parseInt(d);
	System.out.println(result3);


//	4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요.
	String f = "10";
	int g = 3;
	double h = 4.5;
	String result4 = f + (int)(g * h) ;
	System.out.println(result4);
//
//
//	5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
	int a5 = 4;
	double b5 = 3.4;
	String c5 = "6.8";
	String result7 = a5 * (int)(Double.parseDouble(c5)) + String.valueOf((int)b5);
	System.out.println(result7);
//	

//	6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
	int x1 = 111;
	int y1 = 13;
	int result5 = x1 % y1;
	System.out.println(result5);
	int result6 = x1 / y1;
	System.out.println(result6);
//
//	1) 출력결과 : 7
//	2) 출력결과 : 8
	}

}
