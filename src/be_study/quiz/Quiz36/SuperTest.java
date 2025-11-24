package be_study.quiz.Quiz36;

public class SuperTest {
	public static void main(String[] args) {
		/* 1. Orc 객체를 만들고 정보를 출력하시오. */
		Orc orc = new Orc("오크", 80);
		System.out.println(orc.toString());
		System.out.println(orc); // 기본적으로 toString() 호출
		/* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
		OrcWarrior orcWarrior = new OrcWarrior("오크전사", 120, 3);
		System.out.println(orcWarrior.toString());
		System.out.println(orcWarrior);
	}
}

class Orc {
	protected String name;
	protected int hp;

	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String toString() {
//		return "Orc { name: " + name + ", hp: " + hp + " }";
		return String.format("Orc { name : %s, hp : %d }", name, hp);
	}
}

class OrcWarrior extends Orc {
	protected int amor;

	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp);
		this.amor = amor;
	}

// 메소드 오버라이딩!
	public String toString() {
//		return "OrcWarrior { name: " + name + ", hp: " + hp + ", armor: " + amor + " }";
		return String.format("OrcWarrior { name : %s, hp : %d, amor : %d }", name, hp, amor);
	}
}
