class A<T> {
	void display(A<? super T> obj){
		System.out.println("? is super of T");
	}
}

class GenericDemo2{
	public static void main(String args[]){
		A<String> str = new A<>();
		A<Object> obj = new A<>();
		//A<Integer> iob = new A<>();

		str.display(str);
		str.display(obj);
		//str.display(iob);			//Error
	}
}