import java.util.Scanner;
class Sum{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num1,num2;

		System.out.println("Enter number 1: ");
		num1=scan.nextInt();

		System.out.println("Enter number 2: ");
		num2=scan.nextInt();

		System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
	}
}