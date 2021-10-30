import java.util.Scanner;
class Division{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		float num1,num2,value;
		System.out.println("Enter number 1: ");
		num1=scan.nextInt();

		System.out.println("Enter number 2: ");
		num2=scan.nextInt();
		value = num1/num2;
		System.out.println(num1+" / "+num2+" = "+value);
	}
}