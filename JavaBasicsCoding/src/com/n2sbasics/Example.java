package com.n2sbasics;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("welcome");

        System.out.println(args.length);
        for(int i=0; i<args.length; i++) {
        	  System.out.println(args[i]);
        	  
      
        }
       Example obj = new Example();
      System.out.println(obj.add(1,4));
      System.out.println(obj.sub(4,3));
      
	}
	
	
	public int add(int x, int y) 
	{
	return x+y;
	}
	
	public int sub(int x, int y)
	{
	return x-y;
    }

}
class Example2 {
	
}
