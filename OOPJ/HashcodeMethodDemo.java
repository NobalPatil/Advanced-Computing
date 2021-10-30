class HashcodeMethodDemo{
	public static void main(String args[]){
		HashcodeMethodDemo hmd = new HashcodeMethodDemo();

		HashcodeMethodDemo hmd1 = hmd;

		System.out.println(hmd);
		System.out.println(hmd1);

		System.out.println(hmd.hashCode());

		System.out.println(String.format("%x",hmd.hashCode()));		// OR Integer.toHexString(hashCode())
	}
}