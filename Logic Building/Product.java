import java.util.Scanner;
class Product{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num1,num2;
		
		System.out.println("Input first number: ");
		num1 = scan.nextInt();

		System.out.println("Input second number: ");
		num2 = scan.nextInt();

		System.out.println(num1+" x "+num2+" = "+(num1*num2));
	}
}