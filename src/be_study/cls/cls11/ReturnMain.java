package be_study.cls.cls11;

public class ReturnMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllScore as1 = getScore();
		System.out.println(as1.lang);
		System.out.println(as1.math);
		System.out.println(as1.eng);
		
	}
	public static AllScore getScore() {
		AllScore as = new AllScore();
		as.lang = 100;
		as.math = 90;
		as.eng = 80;
		
		return as;
	}
	
	public static String scoreInfo() {
		return "85,90,80";
	}
	
	public static int mathScore() {
		return 90;
	}
	
	public static int engScore() {
		return 80;
	}

}
