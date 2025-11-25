package be_study.abst;

public class Hite extends Beverage{

	double alcol;
	
	public void checkAlcol() {
		System.out.println("알콜 도수 확인");
	}


	public void checkSafety() {
		System.out.println("도수나 알콜 문제 없나 ?");
	}
}
