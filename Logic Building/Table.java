import java.util.Scanner;
class Table{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a;
		
		System.out.println("Enter the Number: ");
		a = scan.nextInt();
		
		for(int i=1;i<=10;i++)
			System.out.println(a+" x "+i+" = "+(a*i));
	}
}