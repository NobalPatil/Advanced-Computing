class PallindromeStr {
	public static void main(String args[]){
		String str1 = "A man, a plan, a canal: Panama.";
		String str2 = "";

		str1 = str1.toLowerCase();

		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)>=97 && str1.charAt(i)<=122){
				str2 += str1.charAt(i);
			}
		}

		str1 = "";

		for(int i=str2.length()-1;i>=0;i--){
			str1 += str2.charAt(i);
		}

		if(str1.equals(str2))
			System.out.println("Given String is Pallindrome");
		else
			System.out.println("Given String is NOT Pallindrome");
	}
}