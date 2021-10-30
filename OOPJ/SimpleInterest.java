import java.util.*;

class SimpleInterest {
	int principalAmt;
	static double rateOfInterest;
	int years;
	double sI;
	Scanner scan = new Scanner(System.in);

	SimpleInterest(){
		System.out.println("Enter Principal Amount:");
		principalAmt = scan.nextInt();
		System.out.println("Enter Rate of Interest:");
		rateOfInterest = scan.nextDouble();
		System.out.println("Enter Number of Years:");
		years = scan.nextInt();
	}

	void calculateSI() {
		sI = principalAmt*rateOfInterest/100*years;
	}

	void display(){
		System.out.println("Simple Interest: "+sI);
	}
	public static void main(String args[]){
		SimpleInterest amt = new SimpleInterest();

		amt.calculateSI();
		amt.display();
	}
}