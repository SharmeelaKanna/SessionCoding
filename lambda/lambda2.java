package lambda;

import java.util.ArrayList;
import java.util.List;
//Introduced in Java 8
public class lambda2 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("sharmee");
		l.add("shalu");
		l.add("priya");
		
		l.forEach((n)-> System.out.println(n) );

	}

}