package be_study.quiz.Quiz28;

public class Circle {

	int radius;

	void setRadius(int radius) {
		this.radius = radius;
	}

	double getArea() {
		return radius * radius * 3.14;
	}
}

class Rectangle {

	int width;
	int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		return width * height;
	}
}

class Triangle {
	int width;
	int height;
	
	void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
        return width * height / 2.0;
    }
}