class JavaWord{
	public static void main(String args[]){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=25;j++){
				if(i==1){
					if(j==4)
						System.out.print("J");
					else if(j==9 || j==22)
						System.out.print("a");
					else if(j==13 || j==19)
						System.out.print("v");
					else
						System.out.print(" ");
				}
				else if(i==2){
					if(j==4)
						System.out.print("J");
					else if(j==8 || j==10 || j==21 || j==23)
						System.out.print("a");
					else if(j==14 || j==18)
						System.out.print("v");
					else
						System.out.print(" ");
				}
				else if(i==3){
					if(j==1 || j==4)
						System.out.print("J");
					else if(j>=7 && j<=11 || j>=20 && j<=24)
						System.out.print("a");
					else if(j==15 || j==17)
						System.out.print("v");
					else
						System.out.print(" ");
				
				}
				else{
					if(j==2 || j==3)
						System.out.print("J");
					else if(j==6 || j==12 || j==19 || j==25)
						System.out.print("a");
					else if(j==16)
						System.out.print("v");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
