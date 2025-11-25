package be_study.inter.inter01;

public class TempMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		TempInterface ti = new TempInterface(); 
//		인터페이스 객체 생성 불가
		
		TempObject to = new TempObject();
		to.method1();
		to.method2();
		
		Temp2Interface ti = new TempObject();
		ti.method1();
		ti.method2();
		
		TempInterface ti1 = new TempObject();
		Temp2Interface ti2 = new TempObject();

		ti1.method3();
		ti2.method1();
		ti2.method2();
		
		
		
	}

}
