package com.oops;

import com.n2sbasics.Example;

public class Constructor {
	public static void main(String[] args) {
		Constructor ct = new Constructor();
		new Constructor();
		new Constructor(10);
		new Constructor("Navis", 10);
		
		Child child = new Child();
		
		//Example ex = new Example();

	}
	
	Constructor() { 
		System.out.println("I am in default constructor");
	}
	
	Constructor(int x) {
		System.out.println("I am in single param constructor " + x);
	}
	
	Constructor(String s, int x) {
		this(); 
		System.out.println("I am in two param constructor " + s + x);
	}
}

class Child extends Constructor {
	
	Child() {
		super(10); 
		System.out.println("I am in Child class constructor");
	}
}