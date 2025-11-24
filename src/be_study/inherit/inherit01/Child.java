package be_study.inherit.inherit01;

public class Child extends Parent {
	String schoolName;
	int grade;

	public Child() {
		super(0);
		System.out.println("Child 생성자 실행됨");
	}

	public Child(String schoolName, int grade) {
		super(0);
		this.schoolName = schoolName;
		this.grade = grade;
	}

	public Child(String schoolName, int grade, int money) {
		super(money);
		this.schoolName = schoolName;
		this.grade = grade;
	}

	public void play() {
		System.out.println("나가서 뛰어 놀고 있습니다.");
	}

	public void printInfo() {
		System.out.println(schoolName + " " + grade + " " + money);
	}

}
