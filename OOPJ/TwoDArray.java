import java.util.*;
class TwoDArray{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		int rows = scan.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols = scan.nextInt();

		int a[][] = new int[rows][cols];

		System.out.println("Enter the array elements: ");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				a[i][j] = scan.nextInt();
			}
		}

		/*for(int[] x : a)
				for(int y : x)
					System.out.println(y);
		*/

		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}