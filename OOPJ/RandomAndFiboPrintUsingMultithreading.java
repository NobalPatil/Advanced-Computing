import java.util.*;

class RandomThread implements Runnable{
	Thread t;
	RandomNFiboPrinter rfp;

	RandomThread(RandomNFiboPrinter rfp){
		this.rfp = rfp;
		t = new Thread(this);
		t.start();
	}

	public void run(){
		rfp.printRandom();
	}
}

class FiboThread implements Runnable{
	Thread t;
	RandomNFiboPrinter rfp;

	FiboThread(RandomNFiboPrinter rfp){
		this.rfp = rfp;
		t = new Thread(this);
		t.start();
	}

	public void run(){
		rfp.printFibo();
	}
}

class RandomNFiboPrinter{
	synchronized void printRandom(){
		Random random = new Random();
		System.out.println("Random Number: "+random.nextInt(100));
	}

	synchronized void printFibo(){
		int a = 0;
		int b = 1;
		int c = 0;

		System.out.println("Fibonacci Series: ");
		System.out.print(a+" "+b);

		for(int i=3;i<=10;i++){
			c = a+b;
			a = b;
			b = c;
			System.out.print(" "+c);
		}
	}
}

class RandomAndFiboPrintUsingMultithreading{
	public static void main(String args[]){
		RandomNFiboPrinter rfp = new RandomNFiboPrinter();

		RandomThread rt = new RandomThread(rfp);
		FiboThread ftr = new FiboThread(rfp);
	}
}