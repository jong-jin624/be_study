package be_study.quiz.quiz25;

public class Monitor {

	
	String make;
	String model;
	int inch;
	
	public Monitor(String make, String model, int inch){
		
		this.make = make;
		this.model = model;
		this.inch = inch;
	}
	
	public void print() {
        System.out.println("제조사 : " + make);
        System.out.println("모델명 : " + model);
        System.out.println("인치 : " + inch + "인치");
        
    }
	
}
