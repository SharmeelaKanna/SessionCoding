package com.n2sbasics;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Example obj = new Example();
        obj.age = 10;
        System.out.println(obj.age);
        System.out.println(obj.add(10,20));
        
        Example2 obj2 = new Example2();
        System.out.println(obj2.mult(10,20));
	}

}
