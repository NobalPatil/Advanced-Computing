import java.util.Scanner;
class SwitchOperations{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num1,num2;
		char choice;
		
		System.out.println("A. Addition\nB. Subtraction\nC. Multiplication\nD. Division\nE. Mod");

		System.out.println("Enter your choice: ");
		choice = scan.next().charAt(0);
		
		System.out.println("Enter first number: ");
		num1 = scan.nextInt();
		System.out.println("Enter second number: ");
		num2 = scan.nextInt();

		switch(choice){
			case 'A':	System.out.println(num1+" + "+num2+" = "+(num1+num2));
				break;
			case 'B':	System.out.println(num1+" - "+num2+" = "+(num1-num2));
				break;
			case 'C':	System.out.println(num1+" x "+num2+" = "+(num1*num2));
				break;
			case 'D':	System.out.println(num1+" / "+num2+" = "+(num1/num2));
				break;
			case 'E':	System.out.println(num1+" % "+num2+" = "+(num1%num2));
				break;
		}
		
	}
}