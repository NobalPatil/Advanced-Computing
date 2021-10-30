import java.io.*;
class ExceptionHandling{
	static void doCalculation() throws IOException,ArithmeticException {

	}

	public static void main(String args[]) throws IOException{
		doCalculation();
		try{
			try{
				System.out.println(1/0);
			}
			catch(Exception e){
				System.out.println(1/0);
				e.printStackTrace();
			}
			throw new ArithmeticException();		//NullPointerException();
		}
		catch(Exception e){
			System.out.println(e.getMessage());

			System.out.println(e);

			e.printStackTrace();
		}
		finally{

		}
	}
}