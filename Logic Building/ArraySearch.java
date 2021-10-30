import java.util.Scanner;
class ArraySearch{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int arr[]={1,4,3,7,8,9,6,5};
		int x;
		boolean flag = true;
		System.out.println("Enter the array element that you want to search: ");
		x = scan.nextInt();

		for(int i=0;i<arr.length;i++){
			if(x==arr[i]){
				System.out.println(x+" is FOUND in Array");
			  	flag = false;
			}
		}

		if(flag)
			System.out.println(x+" is NOT FOUND in Array");
	}
}
