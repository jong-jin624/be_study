package be_study.cls.cls07.pack1;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		p1.math = 90;
		p1.eng = 60;
//		p1.lang = 99; private 접근제한 접근불가
		
		p1.method1();
		p1.method2();
//		p1.method3(); private 접근제한 접근불가
		
		Point p2 = new Point();
		Point p3 = new Point(100, 80, 70);
		
		
		p2.math = 100;
		p2.setMath(100);
		p2.setLang(50);
		
		p2.eng = 60; // 범위 0~100
		p2.eng = -60; // 범위 깨짐
		System.out.println(p2.eng);
		p2.setEng(-60); // 범위 지킴
		System.out.println(p2.eng);
		
		System.out.println(p2.getLang());
		
		
	}

}
