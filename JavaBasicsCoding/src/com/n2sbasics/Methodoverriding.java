package com.oops;


class SuperRiding {
			public void msg() {
				System.out.println("Running from super riding");
			}
		}

		public class Methodoverriding extends SuperRiding {

			public static void main(String[] args) {
				Methodoverriding mo = new Methodoverriding();
				mo.msg();
			}
			public void msg() {
				System.out.println("Running from method overriding");
				super.msg();
	}

}
