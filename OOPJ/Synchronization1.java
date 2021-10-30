class Increamentor {
	synchronized void increament(int i){
		while(i<=100){
			System.out.println(Thread.currentThread().getName()+" : "+i);
			i++;
		}
	}
}

class MyThread implements Runnable {
	Thread t;
	Increamentor inc;

	MyThread(Increamentor inc,String name){
		this.inc = inc;
		t = new Thread(this,name);
		t.start();
	}

	public void run(){
			inc.increament(1);
	}
}

class Synchronization1 {
	public static void main(String args[]){
		Increamentor inc = new Increamentor();
		MyThread mt1 = new MyThread(inc,"Thread1");
		MyThread mt2 = new MyThread(inc,"Thread2");
	}
}