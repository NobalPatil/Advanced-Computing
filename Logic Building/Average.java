import java.util.Scanner;
class Average{
	public static void main(String args[]){
		int a,b,c;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		
		a = scan.nextInt(); 
		b = scan.nextInt(); 
		c = scan.nextInt(); 

		System.out.println("Average: "+(float)((a+b+c)/3));
	}
}