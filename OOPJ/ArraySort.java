import java.util.*;

class ArraySort{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter size of array: ");
		int size = scan.nextInt();

		int a[] = new int[size];
		int temp;

		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++){
			a[i] = scan.nextInt();
		}

		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(a[i]>a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("Sorted Arraty: ");
		for(int x : a)
			System.out.println(x);
	}
}