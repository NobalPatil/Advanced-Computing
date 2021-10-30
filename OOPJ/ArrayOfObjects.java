class ArrayOfObjects {
	int a;

	public static void main(String args[]){
		ArrayOfObjects ao[] = new ArrayOfObjects[10];

		ao[0].a = 20;

		System.out.println(ao[0].a);
	}
}