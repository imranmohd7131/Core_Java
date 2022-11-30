package scanner_class;

import java.util.Scanner;

class check {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name:");
	String name=sc.nextLine();
	System.out.println("Enter your age:");
	int age=sc.nextInt();
	System.out.println("Enter your gender:");
	char gender=sc.next().charAt(0);
	if(age>=21 && gender=='M')
	{
		System.out.println("You can marry now");
	}
	if(age>=18 && gender=='F')
	{
		System.out.println("You can marry now");
	}
}
}
