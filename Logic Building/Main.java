class Math{
	static int sum(int x,int y){
		return x+y;
	}
	static void display(int result){
		System.out.println(result);
	}
}

class Main{
	public static void main(String args[]){
		Math.display(Math.sum(100,200));
	}
}