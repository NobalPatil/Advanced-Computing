import java.util.Scanner;

class ArrayIO{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array Size: ");
		int size = scan.nextInt();
		String arr[] = new String[size];

		System.out.println("Enter the Array Elements: ");
		for(int i=0;i<size;i++){
			arr[i]=scan.nextLine();
		}

		System.out.println("Inserted Array Elements are: 1");
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
	}
}