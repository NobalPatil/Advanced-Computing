import java.util.Scanner;

class LengthConversion{
	public static void main(String args[]){
		float cm;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Length in cm: ");
		cm = scan.nextFloat();

		System.out.println((cm/100)+" m");
		System.out.println((cm/100/1000)+" km");
	}
}