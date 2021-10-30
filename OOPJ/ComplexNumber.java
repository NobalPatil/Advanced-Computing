import java.util.*;

class ComplexNumber {

	static void addComplexNumbers(String complex1,String complex2){
		int real1,real2;
		int imaginary1,imaginary2;
		String i1,i2;

		String c1[] = complex1.split("\\+"); // Or [+]
		real1 = Integer.parseInt(c1[0]);

		if(c1[1].length()==1)
			i1 = c1[1].replace("i","1");
		else
			i1 = c1[1].replace("i","");

		imaginary1 = Integer.parseInt(i1);

		String c2[] = complex2.split("\\+"); // Or [+]
		real2 = Integer.parseInt(c2[0]);

		if(c2[1].length()==1)
			i2 = c2[1].replace("i","1");
		else
			i2 = c2[1].replace("i","");

		imaginary2 = Integer.parseInt(i2);

		System.out.println((real1+real2)+"+"+(imaginary1+imaginary2)+"i");
	}

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 1st Complex Number:");
		String complex1 = scan.nextLine();

		System.out.println("Enter 2nd Complex Number:");
		String complex2 = scan.nextLine();

		addComplexNumbers(complex1,complex2);
	}
}