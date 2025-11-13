package be_study.cls.cls02;

public class Car {
	
	
	String model;
	String color;
	int price;
	
	Car(){
		System.out.println("Car() 기본생성자 호출됨");
		color = "green";
		model = null;
		price = 0;
	}
	
	Car(String _model) {
		System.out.println("Car(String_model) 생성자 호출됨");
		model = _model;
	}
	
	Car(String model, String color){
		System.out.println("Car(String_model, String color) 생성자 호출됨");
		
	}
	
}
