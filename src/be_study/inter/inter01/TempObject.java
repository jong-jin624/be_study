package be_study.inter.inter01;

public class TempObject implements Temp2Interface, TempInterface{

	public void method1() {
		System.out.println("method1()");
	}
	
	public void method2() {
		System.out.println("method2()");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("method3()");
	}
}
