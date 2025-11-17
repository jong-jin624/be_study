package be_study.cls.cls07.pack1;

public class Point {
	int math;
	public int eng;
	private int lang;

	public Point() {
	}

	Point(int math, int eng, int lang) {
		this.math = math;
		this.eng = eng;
		this.lang = lang;
	}

	void method1() {
		System.out.println("method1");
	}

	public void method2() {
		System.out.println("method2");
	}

	private void method3() {
		System.out.println("method3");
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public void setEng(int eng) {
		if(eng >=0 && eng <= 100) {
			this.eng = eng;
		} else {
			this.eng = 0;
		}
		
	}
	public void setLang(int lang) {
		this.lang = lang;
	}

	public int getMath() {
		return this.math;
	}
	public int getEng() {
		return this.eng;
	}
	public int getLang() {
		return this.lang*10;
	}
	
}
