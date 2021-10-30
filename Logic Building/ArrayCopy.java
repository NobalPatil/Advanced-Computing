class ArrayCopy{
	public static void main(String args[]){
		int a[] = {5,15,25,35,45};
		int b[] = new int[a.length];

		for(int i=0;i<a.length;i++){
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}

		System.out.println("- Copied Array");
	}
}