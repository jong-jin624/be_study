package be_study.quiz;

public class Quiz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Hint
//		i, j 값 변화 추적 -> 규칙 찾기
//		print
//		println
//
//
//		※규칙을 찾아보고 작성
//		1) 반복문 1개로 결과 만들기
//		2)반복문 2개 중첩해서 결과만들기
//
//		//아래와 같은 결과가 출력되도록 코드를 작성하시오
//		//1.
//		12345
//		12345
//		12345
//		12345
//		12345
		System.out.println("1번 문제");
//		for (int i=1; i<=5; i++) {
//			System.out.println("12345");
//		}
//		
		
//		for (int i = 1; i<=25; i++) {
//			System.out.print(i % 5 == 0 ? "5\n" : i % 5);
//		}
		
//		for (int i = 1; i<=25; i++) {
//			int n = i % 5;
//			System.out.print((n == 0 ? 5 : n));
//			if(n == 0) System.out.println();
//		}
		
		for(int j=1; j<=5; j++) {
			for(int i=1; i<=5; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		System.out.println();
//		//2.
//		11111
//		22222
//		33333
//		44444
//		55555
		System.out.println("2번 문제");
//		for (int i=1; i<=5; i++) {
//			for (int j=1; j<=5; j++){
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
		for(int i=11111; i<=55555; i=i+11111) {
			System.out.println(i);
		}
		
		
	}

}
