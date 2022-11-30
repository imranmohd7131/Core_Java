package exception;

import java.util.Scanner;

public class num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number:");
		int n=sc.nextInt();
		System.out.println("enter the second number:");
		int n2=sc.nextInt();
		try {
		System.out.println("the result is :"+(n/n2));
		System.out.println("inside try block");
		}catch(ArithmeticException e)
		{
			System.out.println("cannot divide by zero");
		}
		
		System.out.println("program ends");
		
		
		
	}
}
