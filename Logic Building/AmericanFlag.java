class AmericanFlag{
	public static void main(String args[]){
		int i,j;
		for(i=1;i<=9;i++){
			for(j=1;j<=45;j++){
				if(j<=12){
					if(i%2==1){
						if(j%2==1)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					else{
						if(j%2==0 && j<=10)
							System.out.print("*");
						else
							System.out.print(" ");
					}
				}

				if(j>=13)
					System.out.print("=");			
			}
			System.out.println();
		}
		for(i=1;i<=6;i++){
			for(j=1;j<=45;j++)
				System.out.print("=");
			
			System.out.println();
		}
	}
}