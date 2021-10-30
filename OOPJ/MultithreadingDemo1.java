class MyThread extends Thread{
	MyThread(String name){
		super(name);
		//OR - setName(name);
	}

	public void run(){
		try{
			sleep(1000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(getName()+" : Running");
	}
}

class MultithreadingDemo1{
	public static void main(String args[]) throws InterruptedException{
		System.out.println("Main thread started");

		Thread t1 = new MyThread("Thread1");
		Thread t2 = new MyThread("Thread2");

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Main thread ended");
	}
}