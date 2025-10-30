package be_study.var;

public class Variable04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "12";
		int n1 = 11;
		int n2 = 22;
		System.out.println( n1 + n2 + s1);
		System.out.println( n1 + s1 + n2);
		
		
		String s2 = "1234";
		int n3 =16;
		System.out.println(s2 + n3);
		
		System.out.println( Integer.parseInt(s2) + n3 );
//				문자열 정수 변환 Integer.parseInt("1234");
		
		String s3 = "33.55";
//		int n4 = Integer.parseInt(s3); 실수형태 문자열 int변환 x
		double d4 = Double.parseDouble(s3);
		System.out.println(d4);
		
		String s4 = "12a.12b";
//		System.out.println( Double.parseDouble(s4) );
		
		boolean b1 = true;
		
		
		String s5 = "false";
		boolean b2 = Boolean.parseBoolean(s5);
		System.out.println(b2);
		
		String s10 = String.valueOf(true);
		String s11 = String.valueOf(123);
		String s12 = String.valueOf(33.598);
		System.out.println(s10 + s11 + s12 );
		
		String s13 = 123 + ""; // "123"
//				int + String = String
		System.out.println(s13);
	}

}
