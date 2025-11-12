package be_study.cls.cls01;

public class StudentMain {
	
//	실행 클래스 main을 보유한 클래스
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		
		int n;
		n = 10;
		
		int[] arr = null;
		arr = new int[5];
		arr[0] = 50;
		
		Student stu1 = new Student();
		
		Student stu2 = new Student();
		
		stu1.name = "이하나";
		stu2.name = "김둘";
		
		System.out.println(stu1.name);
		System.out.println(stu2.name);
		
		stu1.grade = 3;
		stu2.grade = 5;
		
		System.out.println(stu1.grade);
		System.out.println(stu2.grade);
		
		System.out.printf("%s는 %d학년\n", stu1.name, stu1.grade);
		System.out.printf("%s은 %d학년\n", stu2.name, stu2.grade);
		
		System.out.println(stu1.phone);
		System.out.println(stu2.studentNumber);
	}

}
