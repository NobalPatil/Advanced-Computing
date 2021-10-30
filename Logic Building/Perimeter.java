import java.util.Scanner;
class Perimeter{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int length,breadth;

		System.out.println("Enter the Length: ");
		length = scan.nextInt();

		System.out.println("Enter the Breadth: ");
		breadth = scan.nextInt();

		int perimeter = 2*(length+breadth);
		System.out.println("Perimeter of Rectangle is: "+perimeter);
	}
}