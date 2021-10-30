import java.util.*;

class Circle {
	Scanner scan = new Scanner(System.in);
	double radius;
	double area;
	final double PI = 3.14;

	void init() {
		System.out.println("Enter the radius of circle: ");
		radius = scan.nextDouble();
	}

	void calculateArea() {
		area = PI*radius*radius;
	}

	void display(){
		System.out.println("Radius: "+radius+"\n"+"Area: "+area);
	}
}

class CircleDemo {
	public static void main(String args[]){
		Circle circle = new Circle();

		circle.init();
		circle.calculateArea();
		circle.display();
	}
}