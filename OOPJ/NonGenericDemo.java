class NonGeneric {
	Object ob;

	NonGeneric(){

	}

	NonGeneric(Object ob){
		this.ob = ob;
	}

	Object getObj(){
		return ob;
	}
}

class NonGenericDemo{
	public static void main(String args[]){
		NonGenericDemo ngd = new NonGenericDemo();

		NonGeneric ng = new NonGeneric(ngd);

		NonGenericDemo iobj = (NonGenericDemo)ng.getObj();
		//NonGeneric iobj = (NonGeneric)ng.getObj();

		System.out.println(iobj);
	}
}