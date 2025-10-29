package be_study.var;

public class Variable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num2 = 0b10; // 2진수 표기 10 - > 실제 값 2 	
//		1010 / 0010010
		int num8 = 012; // 8진수 표기 12 - > 실제 값 10
		int num10 = 10; // 10
		int num16 = 0x30; // 16진수 표기 30 - > 실제 값 48
		
		char chr1 = 'A'; // char 타입 (정수타입) : 문자 1개 저장
						 // 'A' 작은따옴표로 감싸서 문자 1개
						 // 'ABC' -> XXX
		char chr2 = 86;
//		char chr3 = 0x0123;
		char chr3 = 0x23; // 16진수 23은 35 / 35 = #
		char chr4 = 'F';
		
		System.out.println(chr1);
		System.out.println(chr2);
		System.out.println(chr3);
		System.out.println(chr4);
		
		char chr5 = '안';
//		char chr5 = '안녕'; char 은 문자 1개만 가능 (작은따옴표 O)
//		문자열 타입 " " (큰 따옴표 O)로 감싼 여러문자
		String s1 = "안";
		String s2 = "녕";
		String s3 = "안녕하세요~";
		String s4 = "1234";
		
		System.out.println(s3);
		System.out.println(s4);
		
		int n =1234; // 정수형
		System.out.println(n+10);
		System.out.println(s4+10); // 문자열 변수 s4에 숫자 더하기
		System.out.println("지금은 " + 16 +"시 입니다."); 
		//출력문에서 문자열에 숫자 더하기
		System.out.println("지금은 16시 입니다.");
		
		String msg = "\"안녕\"하세요";
		System.out.println(msg); // "안녕"하세요 \" 역슬 큰따옴표
		
		System.out.println("어서\t오세요~ \n반갑습니다.");
		
		double d1 = 12.123;
		double d2 = 500.0; 
		double d3 = 5e2;
		double d4 = 0.0012;
		double d5 = 0.12E-2;
		
		float f1 = 23.45; // float타입은 값 뒤에 f 표기

//		논리형 true false 참 거짓
		boolean open = true;
		boolean close = false;
		boolean stop = false;

		boolean isOpened = true;
		boolean isclosed = false;
		
	}

}
