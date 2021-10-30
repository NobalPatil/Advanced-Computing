import java.util.*;

class UpperLower{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		char ch;
		char a;

		System.out.println("Enter the Character: ");
		ch = scan.next().charAt(0);

		for(a ='A';a<='Z';a++){
			if(ch==a){
				System.out.println(ch+" is Uppercase");
				break;
			}
		}
		if(ch!=a)
			System.out.println(ch+" is lowercase");
	}
}
				