package com.practice.practice;

import java.util.Scanner;


abstract class sample {
	abstract void display();
//	final int a=5;
}

public class practice extends sample{
	
	public void display() {
		System.out.println("Calling method from abstract class");
	}
	
	public static void main(String[] args) {
		
	sample p = new practice();
	p.display();
//	System.out.println("Value of a from abstract class :"+a);
}
}
