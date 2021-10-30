class A{
	static void display(){
		System.out.println("In parent class");
	}
}

class B extends A{
	static void display(){
		System.out.println("In child class");
	}
}

class PolymorphInheritDemo{
	public static void main(String args[]){
		A b = new B();
		//B b = (B)new A();
		b.display();
		//B.display();
	}
}