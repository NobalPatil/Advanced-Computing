class Pattern10{
	public static void main(String args[]){
		int k=0,m=0;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+m+" ");
				k=j+m;
			}
			m=k;
			System.out.println();
		}
	}
}
