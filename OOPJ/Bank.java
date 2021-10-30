import java.util.*;

class Bank {
	int customerId;
	String name;
	int balance;

	void deposit(int money){
		balance += money;
		System.out.println("Money Deposited...!");
	}

	void checkBalance(){
		System.out.println("Balance: "+balance);
	}

	void withdraw(int money){
		if(balance-money < 1000){
			System.out.println("You have insufficient balance!!");
			return;
		}
		else{
			balance -= money;
			System.out.println("Money Withdrawed...!");
		}
	}

	public static void main(String args[]){
		Scanner scan  = new Scanner(System.in);
		Bank customer = new Bank();
		int money,choice;
		boolean flag = true;

		System.out.println("Enter Customer ID:");
		customer.customerId = scan.nextInt();

		scan.nextLine();
		System.out.println("Enter Customer Name:");
		customer.name = scan.nextLine();

		System.out.println("Enter Customer Balance:");
		customer.balance = scan.nextInt();


		while(flag){
			System.out.println("MENU\n1. Deposit\n2. Check Balance\n3. Withdraw\n4.Exit");
			System.out.println("Enter your choice:");
			choice = scan.nextInt();

			switch(choice){
				case 1:	System.out.println("Enter Amount to DEPOSIT:");
						money = scan.nextInt();
						customer.deposit(money);
						break;
				case 2:	customer.checkBalance();
						break;
				case 3:	System.out.println("Enter Amount to WITHDRAW:");
						money = scan.nextInt();
						customer.withdraw(money);
						break;
				case 4: flag = false;
			}
		}
	}
}