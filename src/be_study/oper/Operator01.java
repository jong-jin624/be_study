package be_study.oper;

public class Operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		산술 ( + - * / % )
		
		System.out.println( 1+1);
		System.out.println( 10-5 );
		System.out.println( 5*9 );
		System.out.println( 30/7 );
		System.out.println( (double)30/7 );
		System.out.println( 30/7.0 );
		System.out.println( 9%5 );
		System.out.println( 28%9 );
		
//		부호 ( + - )
		System.out.println( 10 );
		System.out.println( +10 );
		System.out.println( -10 );
		System.out.println( -(-10) );
		
		System.out.println("==================================");
		
//		증감 ++ --
		int x = 8;
		System.out.println(x); //8
		System.out.println( ++x ); //9
		System.out.println(x); //9
		
		System.out.println( x++ );
		System.out.println(x);
		
		int y = 10;
		System.out.println(y--);
		System.out.println(--y);
		System.out.println(y);
				
		int z = 30;
		System.out.println(z+1);
		System.out.println(z++);
		System.out.println(z);
		
		int q = 1;
		int w = 3;
		int e = 10 + ++q;
		int r = 3 + w--;
		
		System.out.printf("%d %d %d %d\n", q, w, e, r);
		
//		논리 부정 ! true false
		boolean isHungry = true;
		System.out.println(isHungry);
		System.out.println(!isHungry);
		System.out.println(isHungry);
		System.out.println(true);
		System.out.println(false);
		System.out.println(!true);
		System.out.println(!false);

//		isHungry = false;
		isHungry = !isHungry;
		System.out.println(isHungry);
		
//		문자열 결합 연산자 +
		System.out.println(133 + 3.345 + "문자");
		
//		비교
		System.out.println( 1 == 2 );
		System.out.println( 1 != 2 );
		System.out.println( 3 < 5 );
		System.out.println( 10 >= 9 );
		System.out.println( 4 > 4 );
		System.out.println( 9 <= 1 );
		
//		논리
//		AND &&  OR ||
		boolean b2 = ( 10 > 6 ) && ( 10 > 5 );
		System.out.println(b2);
		
		boolean b3 = ( 5 != 1 ) && ( 10 < 4 );
		System.out.println(b3);
		
		boolean b4 = ( 2 >= 1 ) && ( 3 < 4 );
		System.out.println(b4);
		
//		대입
		int a = 30;
		a = 50;
		
		a += 30;
		System.out.println(a);
		a -= 10;
		System.out.println(a);
		
//		+= -= *= /= %=
		
		
//		삼항 연산자 (조건)
		int point = 400;
		
		
		String eventItem = point > 200 ? "커피" : "생수";
		String eventItem2 = point <= 200 ? "생수" : "커피";
		String eventItem3 = ( point <= 200 ? "생수" : (point > 300 ? "맥주" : "커피" ));
		System.out.println(eventItem);
		System.out.println(eventItem2);
		System.out.println(eventItem3);
		
		
		if (point > 200) {
		System.out.println("사은품 coffee임다.");
		} else 
		System.out.println("사은품 생수임다");
		
		
		
		int num = 0;
		System.out.println( num > 0 ? "양수" : "음수" );
		
		System.out.println( num == 0 ? "0" : (num > 0 ? "양수" : "음수"));
		System.out.println( num != 0 ? (num < 0 ? "음수" : "양수") : "0");
		
		System.out.println( num > 0 ? "양수" : (num < 0 ? "음수" : "0"));
		System.out.println( num >= 0 ? (num == 0 ? "0" : "양수") : "음수");
		
	}

}
