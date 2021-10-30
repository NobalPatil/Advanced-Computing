class Pattern13{
	public static void main(String args[]){
		int k=1;
		String str;

		for(int i=1;i<=5;i++){
			for(int j=4;j>=i;j--)
				System.out.print(" ");

			if(i>1){
				k*=11;
				str=Integer.toString(k);

				for(int j=0;j<str.length();j++){
					System.out.print(str.charAt(j)+" ");
				}
			}
			else
				System.out.print(k);

			System.out.println();
		}
	}
}
