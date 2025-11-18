package be_study.cls.cls08;

public class Singleton {

	static Singleton singleton = new Singleton();
	
	private Singleton() {

	}

	static Singleton getInstance() {
		if(singleton == null)
			singleton = new Singleton();
		
		return singleton;
	}
}
