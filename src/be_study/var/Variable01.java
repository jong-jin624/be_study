package be_study.var;

public class Variable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		변수 선언
//		타입 변수명
//		int 타입 : 정수형 숫자 타입
		
		int abc; // 변수 선언
		int def; // 정수형 숫자 타입의 변수
		
		int point;
		int score;
//		int score = 90; 중복 선언 X
		int math = 99; // 선언과 동시에 저장 = 초기화
		
		int time;  // 변수 선언
		time = 12; // 12 값 저장
		time = 13; // 13 값 저장

		int myTime = 10 + 5 - 2; // 연산 ㄱㄴ
		myTime = time + 5; // 18
		myTime = time + 4 + time - 1 + time; // 42
		
		score = 90; // score 라는 변수에 90이란 값을 저장
		System.out.println(score); // 위에서 아래로 실행하기 때문에
//									선언한 라인보다 아래에서 사용해야
		
//		level = 99;
		int level;
		
//		int x;
//		int y;
//		int z;
		
		int x, y, z;
		
		int maxSpeed;
		
//		int value;  선언만 하고 초기화되지 않은 수는 연산 불가
//		int result = value + 5
		
		int value = 20;
		int result = value + 5;
		
//		abc = 3;
//		System.out.println(abc);
		

//		출력
		System.out.println("문자");
		System.out.println(12345);
		System.out.println(value);
		System.out.println(result);
//		System.out.println(level); 초기화 되지 않은 변수 출력 X
		
		System.out.println(result + 50);
		
		int totalScore = score + score + 50;
		System.out.println(totalScore);
		
		System.out.println(totalScore + 30);
		
		
		int a = 10;
		int b = 20;
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
