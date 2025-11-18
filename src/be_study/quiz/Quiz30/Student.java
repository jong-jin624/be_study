package be_study.quiz.Quiz30;

public class Student {
	private String major;
	private String numbers;

	private Student(String major, String numbers) {
		this.major = major;
		this.numbers = numbers;
	}
	
	public Student() {}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public String getNumbers() {
		return this.numbers;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("컴공", "1234");
		System.out.println(st1.major + " " +st1.numbers);
		
		Student st2 = new Student();
		st2.setMajor("경영");
		st2.setNumbers("4321");
		System.out.println(st2.getMajor() + " " +st2.getNumbers());
	}
}



//· 필드를 모두 private 로 하고, getter 와 setter 를 구현하고
//· Student 클래스의 main() 메소드에서 Student 객체를 생성하여
//setter 를 사용하여 학과와 학번 필드에 적당한 값을 입력 후 출력