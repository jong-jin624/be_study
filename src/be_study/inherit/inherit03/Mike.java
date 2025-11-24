package be_study.inherit.inherit03;

public class Mike {

	String type;
	String model;
	int price;

	public void volumeUp() {
		System.out.println("Mike volumeUp");
	}
	
	public final void noMethod() {
		System.out.println("noMethod");
	}

}
