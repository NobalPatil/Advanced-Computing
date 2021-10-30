import java.util.*;

class ItemNotFoundException extends RuntimeException{
	ItemNotFoundException(String msg){
		super(msg);
	}
}

class NotPallindromeException extends RuntimeException{
		NotPallindromeException(String msg){
			super(msg);
		}
}

class UserDefineExceptionDemo{
	static void checkNumber(Integer number,List<Integer> list){
		if(list.contains(number))
			System.out.println(number+" is Found in a List");
		else
			throw new ItemNotFoundException("Number not Found in List");
	}

	static void checkPallindrome(int num){
		int temp = num;
		int rem,sum = 0;

		while(num>0){
			rem = num%10;
			sum = sum*10+rem;
			num = num/10;
		}

		if(sum==temp)
			System.out.println(sum+" is Pallindrome");
		else
			throw new NotPallindromeException("Given number is not pallindrome number");
	}


	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number to search in a list:");
		Integer number = scan.nextInt();

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		try{
			checkNumber(number,list);

			System.out.println("Enter number to check number is pallindrome number or not:");
			int num = scan.nextInt();

			checkPallindrome(num);
		}
		catch(Exception e){
					e.printStackTrace();
		}
	}
}