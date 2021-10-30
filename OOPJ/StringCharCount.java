import java.util.*;
class StringCharCount{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = scan.nextLine();

		int vowels=0,cons=0,digits=0,others=0;

		str = str.toLowerCase();

		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
				vowels++;
			else if(str.charAt(i)>='b' && str.charAt(i)<='z')
				cons++;
			else if(str.charAt(i)>='0' && str.charAt(i)<='9')
				digits++;
			else
				others++;
		}

		System.out.println("Vowels: "+vowels+"\n"+"Consonants: "+cons+"\n"+"Digits: "+digits+"\n"+"Others: "+others);
	}
}