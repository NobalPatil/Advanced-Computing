import java.util.Scanner;
class Rectangle{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		float width,height;

		System.out.println("ENTER THE WIDTH: ");
		width = scan.nextFloat();

		System.out.println("ENTER THE HEIGHT: ");
		height = scan.nextFloat();
		
		System.out.println("Area is "+width+"*"+height+" = "+(width*height));
		System.out.println("Perimeter is 2*["+width+"+"+height+"] = "+(2*(width+height)));
	}
}