class StaticBlock {
	static int x;

	static{
		x=10;
		System.out.println(x);
	}

	public static void main(String args[]) {
		System.out.println("In Main");
	}
}