package be_study.cls.cls03;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc c1 = new Calc();
		c1.powerOn();
		
		c1.setOwner("에드워드리");
		
		Calc c2 = new Calc();
		c2.powerOn();
		c2.setOwner("김풍");
		
		int result1 = c2.sum(10, 20);
		System.out.println(result1);
		
		System.out.println(c2.sum(50, 100));
		
		double result2 = c2.divide(10, 20);
		System.out.println(result2);
		System.out.println(c2.divide(60, 13));
		
		
		int cb = c2.checkBattery();
		System.out.println(cb);
	}

}
