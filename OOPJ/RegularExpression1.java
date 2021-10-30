import java.util.*;

class RegularExpression1 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String str;
		String regex = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#.+!_-]).{8,20}";

		while(true){
			System.out.println("Enter the Password:");
			str = scan.next();
			if(str.matches(regex))
				System.out.println("Password Created Successfully");
			else
				System.out.println("Please enter 8 charactered password");
		}
	}
}