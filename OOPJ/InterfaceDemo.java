
interface Testable {
	int MAX = 12;
	void display();
	void test();
}

abstract class MidClass implements Testable{
	public void display(){
		System.out.println("Displayed...");
	}
}

class InterfaceDemo extends MidClass{

	public void test(){
		System.out.println("Tested...");
	}

	public static void main(String args[]){
		Testable obj = new InterfaceDemo();

		obj.display();
		obj.test();
		System.out.println(Testable.MAX);
	}
}