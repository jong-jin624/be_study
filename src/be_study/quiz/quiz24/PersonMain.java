package be_study.quiz.quiz24;

import be_study.cls.cls02.Car;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		
		p1.name = "홍길동";
		p1.gender = "남자";
		p1.age = 20;
		p1.tall = 180;
		p1.kg = 70;
		p1.job = "개발자";
		p1.blood = "B";
		p1.health = "건강함";
		p1.sleep = "수면 X";
//		p1.isSleeping = false;
		
		System.out.println("이름: "+ p1.name);
		System.out.println("성별: "+ p1.gender);
		System.out.println("나이: "+ p1.age);
		System.out.println("키: "+ p1.tall);
		System.out.println("몸무게: "+ p1.kg);
		System.out.println("직업: "+ p1.job);
		System.out.println("혈액형: "+ p1.blood);
		System.out.println("건강상태: "+ p1.health);
		System.out.println("수면여부: "+ p1.sleep);
		
		Person p2 = new Person("전우치", 32, 166, "수면 O");
		System.out.println("-----------------------------");
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.tall);
		System.out.println(p2.sleep);
		
	}

}
