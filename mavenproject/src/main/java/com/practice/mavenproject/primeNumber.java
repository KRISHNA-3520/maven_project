package com.practice.mavenproject;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		
		int a,m,flag=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number to check prime or not");
		a = in.nextInt();
		m=a/2;
		if(a==0||a==1)
		{
			System.out.println(a+" is not a prime number");
		}
		else
		{
			for(int i=2;i<=m;i++)
			{
				if(a%i==0)
				{
					System.out.println(a+ " is not a prime number");
					flag=1;
					break;		
				}
			}
			if(flag==0)
			{
				System.out.println(a+ " is prime number");
			}
		}

	}

}
