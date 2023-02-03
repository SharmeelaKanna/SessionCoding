package Execptions;

public class Execption3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i = 20 / 0;
			System.out.println(i);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		finally {
			//in all
			System.out.println("Finally always get executed");
		}
		//it will not get executed.
		System.out.println("Maintaing the flow of application");
	}

}
