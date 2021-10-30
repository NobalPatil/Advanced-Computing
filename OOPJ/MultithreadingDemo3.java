class HelloThread implements Runnable {
	Thread t;
	HelloCDACPrinter print;

	HelloThread(HelloCDACPrinter print){
		this.print = print;
		t = new Thread(this);
		t.start();
	}

	public void run(){
		for(int i=1;i<5;i++)
			print.printHello();
	}
}

class CDACThread implements Runnable {
	Thread t;
	HelloCDACPrinter print;

	CDACThread(HelloCDACPrinter print){
		this.print = print;
		t = new Thread(this);
		t.start();
	}

	public void run(){
		for(int i=1;i<5;i++)
			print.printCDAC();
	}
}
class HelloCDACPrinter {
	boolean flag = false;

	synchronized void printHello(){
		try{
			if(flag)
				wait();

			System.out.println("Hello");
			flag = true;
			notify();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	synchronized void printCDAC(){
		try{
			if(!flag)
				wait();

			System.out.println("CDAC");
			flag = false;
			notify();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
class MultithreadingDemo3 {
	public static void main(String args[]){
		HelloCDACPrinter print = new HelloCDACPrinter();

		HelloThread ht = new HelloThread(print);
		CDACThread ct = new CDACThread(print);
	}
}