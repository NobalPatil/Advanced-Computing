import java.util.*;

class ArmstrongNo {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int temp,rem,count=0,armstrong=0;

		System.out.println("Enter the number: ");
		int num = scan.nextInt();

		temp = num;

		while(temp>0){
			temp = temp/10;
			count++;
		}

		temp = num;

		while(count>0){
			rem = temp%10;
			temp = temp/10;
			armstrong += rem*rem*rem;
			count--;
		}

		if(num == armstrong)
			System.out.println("Given number is Armstrong");
		else
			System.out.println("Given number is NOT Armstrong");
	}
}