package com.oops;

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodoverloading mo = new Methodoverloading();
		System.out.println(mo.met("Sharmee"));
		System.out.println(new Methodoverloading().met("without name"));
		System.out.println(mo.met(10.25f, 10.02f));
		System.out.println(mo.met(4, 5));
		System.out.println(mo.met(10, 10, 20));
		
	}
	public int met(int x, int y) {
		return x+y;
	}
	
	public int met(int x, int y, int z) {
		return x+y+z;
	}
	
	public float met(float x, float y) {
		return x+y;
	}
	
	public String met(String s) {
		return s;
	}
}
