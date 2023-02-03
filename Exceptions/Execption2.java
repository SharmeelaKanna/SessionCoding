package Execptions;

public class Execption2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		String s = null;
		try {
			i = 10 / 0;
			System.out.println(s.length());
			System.out.println(i);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		catch(NullPointerException npe) {
			npe.printStackTrace();
		}
	
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
