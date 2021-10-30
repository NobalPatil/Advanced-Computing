import java.util.*;
class TwoDArrayMul{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of rows for array A: ");
		int rows1 = scan.nextInt();

		System.out.println("Enter the number of columns for array A: ");
		int cols1 = scan.nextInt();

		System.out.println("Enter the number of rows for array B: ");
		int rows2 = scan.nextInt();

		System.out.println("Enter the number of columns for array B: ");
		int cols2 = scan.nextInt();

		if(cols1!=rows2){
			System.out.println("Multiplication not possible!!");
		}
		else{
			int a[][] = new int[rows1][cols1];
			int b[][] = new int[rows2][cols2];
			int c[][] = new int[rows1][cols2];

			System.out.println("Enter the elements for array A: ");
			for(int i=0;i<rows1;i++)
				for(int j=0;j<cols1;j++)
					a[i][j] = scan.nextInt();

			System.out.println("Enter the elements for array B: ");
			for(int i=0;i<rows2;i++)
				for(int j=0;j<cols2;j++)
					b[i][j] = scan.nextInt();

			for(int i=0;i<rows1;i++)
				for(int j=0;j<cols2;j++)
						for(int k=0;k<rows2;k++)
							c[i][j]	+= a[i][k] * b[k][j];

			System.out.println("Multiplication of 2 2D Array: ");
			for(int i=0;i<rows1;i++) {
				for(int j=0;j<cols2;j++) {
					System.out.print(c[i][j]+"\t");
				}
				System.out.println();
			}
		}
	}
}