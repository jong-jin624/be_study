package be_study.cls.cls02;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car();
	
		car1.model = "아반떼";
		System.out.println(car1.model);
		System.out.println(car2.color);
		
		System.out.println(car1.color);
		car1.color = "blue";
		System.out.println(car1.color);
		
		Car car3 = new Car();
		Car car4 = new Car("소나타");
		
		System.out.println(car4.model);
	}

}
