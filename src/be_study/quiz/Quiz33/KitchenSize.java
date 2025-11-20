package be_study.quiz.Quiz33;

public class KitchenSize {
	
	int space;
	String wallpaperColor;
	int height;

	Frige frige;
	GasRange gasRange;
	Sink sink;
	TrashCan[] trashCan;
	Cup[] cup;
}
 
class Frige {
	String brand;
	int literSize;
	int doorCount;
	boolean isPowerOn = false;
	int temperature;
	Ice iceTray;
	

	public void powerOn() {
		isPowerOn = true;
	}
	
	public void powerOff() {
		isPowerOn = false;
	}

	public void tempUp() {
	}

	public void tempDown() {
	}
	
	int upTemperature() {
		temperature++;
		return temperature;
	}
	
	void downTemperature() {
		temperature--;
	}

}

class GasRange {

	int fireCount;
	String brand;
	int price;

	public void turnOn() {}
	public void turnOff() {}
	public void setFireLevel(int level) {}

}

class Sink {

	int width;
	int height;
	int deep;
	String color;
	String material;
}

class TrashCan {

	int liter;
	String color;
	int sizeMuch;

	public void fill(int sizeMuch) {}
	public void open() {}
	public void close() {}
	public void empty() {}

}

class Ice {

	int Count;
	int price;
}

class Cup {

	int size;
	String material;
	String color;
}