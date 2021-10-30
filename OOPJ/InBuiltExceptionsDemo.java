import java.util.*;

class InBuiltExceptionsDemo {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter num1:");
		int a = scan.nextInt();

		System.out.println("Enter num2:");
		int b = scan.nextInt();

		try{
			System.out.println(a+" / "+b+" = "+(a/b));

			System.out.println("Enter the String:");
			String str = scan.next();
			int value = Integer.parseInt(str);

			int arr[] = new int[3];
			System.out.println("Array Elements:");
			for(int i=0;i<=3;i++){
				System.out.println(arr[i]);
			}
		}
		catch(ArithmeticException ae){
			ae.printStackTrace();
		}
		catch(NumberFormatException nfe){
			nfe.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException aie){
			aie.printStackTrace();
		}
		finally{
			//System.out.println(1/0);
			System.out.println("Program Completed");
		}
	}
}