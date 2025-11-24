package be_study.inherit.inherit01;

public class Parent extends GrandParent {
//	private int money; 프라이빗은 상속 안됨
	protected int money;
//	protected : 같은 패키지 + 상속받은 자식
	public Parent(int money) {
		System.out.println("Parent(int money) 생성자 실행됨");
		this.money = money;
	}
	
	public void say() {
		System.out.println("한말씀 드립니다.");
	}
}
