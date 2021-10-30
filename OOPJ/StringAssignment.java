import java.util.*;

class StringAssignment {

	static void pattern(){
		char alpha = 'A';

		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(alpha);
				alpha++;
			}
			System.out.println();
		}
	}

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String:");
		String str = scan.nextLine();

		System.out.println("Enter the String1:");
		String str1 = scan.nextLine();
		System.out.println("Enter the String2:");
		String str2 = scan.nextLine();

		System.out.println(str.replace('C','e'));

		System.out.println(str.replace(" ",""));

		System.out.println(str1.concat(str2));

		System.out.println(str.isEmpty());

		if(str1.equals(str2))
			System.out.println("equal");
		else
			System.out.println("Not equal");

		if(str.contains("Cdac"))
			System.out.println("Yes");
		else
			System.out.println("No");

		pattern();
	}
}