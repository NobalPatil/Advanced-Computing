class ArrayGvLv{
	public static void main(String args[]){
		int a[] = {34,80,21,78,53};
		int gValue=0,lValue;

		for(int i=0;i<a.length;i++){
				if(a[i]>gValue)
					gValue = a[i];
		}

		lValue = gValue;

		for(int i=0;i<a.length;i++){
				if(a[i]<lValue)
					lValue = a[i];
		}

		System.out.println("Greatest Array Elements is: "+gValue);
		System.out.println("Lowest Array Elements is: "+lValue);
	}
}