package be_study.quiz.quiz26;

public class TV {
	String make;
	int year;
	int inch;

	TV(String make, int year, int inch) {
		this.make = make;
		this.year = year;
		this.inch = inch;
	}

	void show() {
		System.out.println(make + "제품 " + year + "년형 " + inch + "인치 TV");
	}
}
