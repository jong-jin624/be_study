package be_study.iter;

public class Iter03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문 중첩
		
		// 2  3
		// 중첩 for 문 
		for(int i=1; i<=5; i++) {
			
			System.out.println("for i 실행문 " + i);

			for(int j=1; j<=3; j++) {
				System.out.println("> for j 실행문 " + j);
			}
			
			System.out.println("---for 실행문 end---");
		}
		
		
		for(int i=1; i<=3; i++) {  //i: 1 2 3  (방 3개 의미)
			System.out.println(i + "번 방 청소");
			//쓸기 3번 의미
			for(int j=1; j<=3; j++) {  //j: 1 2 3 (3번 쓸기)
				System.out.println("쓸기");
			}
			
			int k=1;
			while(k<=2) {
				System.out.println("닦기");
				k++;
			}
			
			System.out.println("쓰레기 정리");
		}
		
	}

}
