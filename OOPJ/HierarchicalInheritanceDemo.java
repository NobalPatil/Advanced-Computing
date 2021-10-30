abstract class Shape{
	double perimeter;

	abstract void calculatePeri();

	void area(){
		System.out.println("Area of Shape");
	}
}

class Circle extends Shape {
	double radius = 20;

	void area(){
		System.out.println("Area of Circle: "+(Math.PI*radius*radius));
	}

	void calculatePeri(){
		perimeter = 2*Math.PI*radius;
		System.out.println("Perimeter of Circle: "+perimeter);
	}
}

class Rectangle extends Shape {
	double length,breadth;

	void area(double length,double breadth){
		this.length = length;
		this.breadth = breadth;

		System.out.println("Area of Rectangle: "+(length*breadth));
	}

	void calculatePeri(){
			perimeter = 2*(length+breadth);
			System.out.println("Perimeter of Rectangle: "+perimeter);
	}
}

class HierarchicalInheritanceDemo{
	public static void main(String args[]){
		Shape c = new Circle();
		Rectangle r = new Rectangle();

		c.area();
		r.area(2,4);

		c.calculatePeri();
		r.calculatePeri();
	}
}