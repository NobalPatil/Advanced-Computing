class MyThread implements Runnable {
	Thread t;
	public MyThread(String name) {
		t = new Thread(this,name);		//t = new Thread(this);	t.setName(name);

		try{
					t.sleep(1000);
				}
				catch(InterruptedException ie){
					ie.printStackTrace();
		}

		t.start();
	}

	public void run() {
		System.out.println(t.getName()+" : Running");
	}
}

class MultithreadingDemo2 {
	public static void main(String args[]) {
		new MyThread("Thread1");
		new MyThread("Thread2");
		new MyThread("Thread3");
	}
}