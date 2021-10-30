import java.util.Scanner;

class Circle{
	public static void main(String args[]){
		float r;
		final float PI = 3.14f;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Radius: ");
		r = scan.nextInt();

		System.out.println("Diameter of Circle: "+(2*r));
		System.out.println("Circumference of Circle: "+(2*PI*r));
		System.out.println("Area of Circle: "+(PI*r*r));
	}
}