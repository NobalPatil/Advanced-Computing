class GarbageCollector {
	GarbageCollector x;
	protected void finalize(){
		System.out.println("In finalize() method");
	}

	void display(){
			GarbageCollector gc2 = new GarbageCollector();
			System.out.println("In display()");
	}

	public static void main(String args[]){
		GarbageCollector gc = new GarbageCollector();
		GarbageCollector gc1 = new GarbageCollector();

		//gc = gc1;
		//gc = new GarbageCollector();

		//gc = null;

		//new GarbageCollector();

	//	{
	//		GarbageCollector gc2 = new GarbageCollector();	// System.gc() NOT working for this!
	//	}

		//gc.display();

		gc.x = gc1;
		gc1.x = gc;

		gc = null;
		gc1 = null;

		System.gc();
	}
}