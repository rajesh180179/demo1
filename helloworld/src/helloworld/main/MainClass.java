package helloworld.main;

import helloworld.pack1.MathOprs;

public class MainClass {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("New message added");
		
		
		MathOprs oprs = new MathOprs();
		System.out.println(oprs.sum(10, 20)); 
		
	}

}
