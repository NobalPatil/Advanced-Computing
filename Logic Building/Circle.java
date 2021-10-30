import java.util.*;
class Circle{
	public static void main(String args[]){
		float radius;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Radius: ");
		radius = scan.nextFloat();
		
		System.out.println("Perimeter is = "+(2*Math.PI*radius));
		System.out.println("Area is = "+(Math.PI*radius*radius));
	}
}
		