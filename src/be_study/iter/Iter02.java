package be_study.iter;

public class Iter02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(초기화; 조건; 증감) {
//			실행문
//		}
//		
//		while(조건) {
//			실행문
//			증감
//		}
		
		for(int i=1; i<=5; i++) {
			System.out.println("햄버거");
		}
		
		int i=1;
		while(i<=5) {
			System.out.println("짜장면");
			i++;
		}
		
		i=10;
		while(true) {
//			System.out.println("무한루프~ break " + i);
			
			i++;
			
			System.out.println("무한루프~ break " + i);
			
			if(i==21)
				break;
			 // 조건문 switch 
			 //	반복문 for while do-while 다씀 (break;)
			
			
//			System.out.println("무한루프~ break " + i);
		}
		
		
		i = 30;
		do {
			System.out.println("일단 한번 먼저 실행 do while");
		} while(i<10);
		
		while(i<10) {
			System.out.println("그냥 while");
		}
		
		for(i=1; i<=10; i++) {
			
			if(i==5) {
				continue; // 밑에 실행 x 바로 조건식으로 이동
			}
			System.out.println("i: " + i);
			
			if(i==8) {
				break;
			}
		}
		
	}

}
