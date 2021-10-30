import java.util.*;

class MathOperation{
	static int add(int x,int y){
		return x+y;
	}
	static int subtract(int x,int y){
		return x-y;
	}
	static int multiply(int x,int y){
		return x*y;
	}
	static int power(int x,int y){
		int pow = y;
		for(int i=1;i<x;i++){
			pow *= y;
		}
		return pow;
	}
}

class ArithmeticDemo{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter two numbers: ");

		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println("Addition: "+MathOperation.add(a,b));
		System.out.println("Subtraction: "+MathOperation.subtract(a,b));
		System.out.println("Multiplication: "+MathOperation.multiply(a,b));
		System.out.println("Power: "+MathOperation.power(a,b));

	}
}