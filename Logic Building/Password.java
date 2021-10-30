import java.util.Scanner;
class Password{
	public static void main(String args[])
	{
		String pass;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the password: ");
		pass = scan.nextLine();
		
		System.out.println("Your password is: "+pass);
	}
}