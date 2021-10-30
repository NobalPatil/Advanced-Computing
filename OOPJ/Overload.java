class MathOperation2 {
	long multiply(int a,int b){
		return a*b;
	}

	double multiply(float a,float b,float c){
		return a*b*c;
	}

	long multiply(int[] arr){
		int n = 1;
		for(int i=0;i<arr.length;i++){
			n *= arr[i];
		}
		return n;
	}

	double multiply(double a,int b){
		return a*b;
	}
}

class Overload {
	public static void main(String args[]){
		MathOperation2 math = new MathOperation2();

		int x = 4,y = 5;
		float f = 3.2f,g = 1.5f,h  = 6.0f;
		double d = 4.88;
		int arr[] = {1,2,3,4,5,6,7,8};

		System.out.println("multiply(int a,int b) -> "+math.multiply(x,y));
		System.out.println("multiply(float a,float b,float c) -> "+math.multiply(f,g,h));
		System.out.println("multiply(int[] arr) -> "+math.multiply(arr));
		System.out.println("multiply(double a,int b) -> "+math.multiply(d,y));
	}
}