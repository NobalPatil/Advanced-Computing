class ArrayReverse{
	public static void main(String args[]){
		int a[] = {1,2,3,4,5,6,7,8};
		int temp;

		for(int i=0;i<a.length;i++){
			temp = a[a.length-1];
			for(int j=a.length-2;j>=0;j--){
				a[j+1] = a[j];
			}
			a[i] = temp;
			System.out.println(a[i]);
		}
	}
}