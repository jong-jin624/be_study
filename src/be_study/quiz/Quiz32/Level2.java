package be_study.quiz.Quiz32;

class Person {

	// 11. Person 객체 하나를 만들어 name과 age를 설정하고 출력하라.
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

	// 12. hello() 메서드
	void hello() {
		System.out.println(name + " : 안녕 !");
	}
}

public class Level2 {

	public static void main(String[] args) {

		Person p1 = new Person("홍길동", 30); // 11
		p1.showInfo(); // 11

		p1.hello(); // 12

		printName(p1); // 13

		Person p2 = personReturn("전우치", 33); // 14
		p2.showInfo(); // 14

		Person older = moreAge(p1, p2);
		System.out.println("나이가 더 많은사람 : " + older.name); // 15

		Person plus = plusAge(p1);
		System.out.println("한살 추가 : " + plus.age); // 16

		inputTest(); // 17

		Person[] group = { new Person("봉미선", 30), new Person("신형만", 33), new Person("흰둥이", 1) };

		arrayTest(); // 18
		helloAll(group); // 19

		Person oldest = findOlder(group); // 20
		System.out.println("가장 나이가 많은 사람 : " + oldest.name);
	}

	// 13. Person 객체를 매개변수로 받아 name 출력
	static void printName(Person p) {
		System.out.println("이름 : " + p.name);
	}

	// 14. Person 객체 생성 후 리턴
	static Person personReturn(String name, int age) {
		Person p = new Person(name, age);
		return p;
	}

	// 15. 나이 비교 후 더 많은 사람 리턴
	static Person moreAge(Person p1, Person p2) {
		if (p1.age > p2.age) {
			return p1;
		} else {
			return p2;
		}
	}

	// 16. age 1 증가
	static Person plusAge(Person p) {
		p.age = p.age + 1;
		return p;
	}

	// 17. 참조 복사 테스트
	static void inputTest() {
		Person p1 = new Person("타이슨", 40);
		Person p2 = p1;

		p2.age = 30;

		System.out.println("p1.age = " + p1.age); // 30
		System.out.println("p2.age = " + p2.age); // 30
	}

	// 18. 배열 생성 후 이름 출력
	static void arrayTest() {
		Person[] arr = new Person[3];
		arr[0] = new Person("짱구", 25);
		arr[1] = new Person("철수", 5);
		arr[2] = new Person("맹구", 30);

		for (Person p : arr) {
			System.out.println("이름 : " + p.name);
		}
	}

	// 19. 배열 모든 사람 hello()
	static void helloAll(Person[] people) {
		for (Person p : people) {
			p.hello();
		}
	}

	// 20. 가장 나이 많은 사람 찾기
	static Person findOlder(Person[] people) {
		Person oldest = people[0];

		for (Person p : people) {
			if (p.age > oldest.age) {
				oldest = p;
			}
		}
		return oldest;
	}
}
