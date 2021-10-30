import java.util.Scanner;
class EvenNum{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int x;
		System.out.println("Enter the number: ");
		x = scan.nextInt();
		if(x%2==0)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
