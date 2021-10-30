class Generic<T>{		// try <T extends Number>
	T v;

	Generic(T v){
		this.v = v;
	}

	T getValue(){
		return v;
	}
}

class GenericDemo{
	public static void main(String args[]){
		Generic<Integer> g = new Generic<>(120); // OR Generic<Integer> g = new Generic<Integer>(120);
		Integer iobj = g.getValue();

		//Double dobj = (Double)g.getValue();	 // error: incompatible types: Integer cannot be converted to Double

		Generic<String> gs = new Generic<>("Generics");
		String str = gs.getValue();

		System.out.println(iobj);
		System.out.println(str);
	}
}