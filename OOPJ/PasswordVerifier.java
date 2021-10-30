import java.util.*;

class PasswordFormatException extends Exception {
	PasswordFormatException(String str){
		//super(str);
	}
	public String getMessage(){
		return "Incorrect Format...";
	}
}

class PasswordVerifier {
	static void checkFormat(String password) throws PasswordFormatException {
		String regex = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#.+!_-]).{8,20}";

		if(password.matches(regex))
			System.out.println("Correct Password Format!!");
		else
			throw new PasswordFormatException("Incorrect Password Format!!");
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Password:");
		String password = scan.next();

		try {
			checkFormat(password);
		}
		catch(PasswordFormatException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Program Completed");
	}
}