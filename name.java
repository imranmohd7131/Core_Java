package scanner_class;
import java.util.Scanner;
class name {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name:");
	String name=sc.nextLine();
	
	System.out.println("Enter your age:");
	int age=sc.nextInt();
	
	System.out.println("Enter your college name:");
	sc.nextLine();
	String clgname=sc.nextLine();
	
	System.out.println("Enter your roll:");
	int roll=sc.nextInt();
	System.out.println("Your name is :"+name);
	System.out.println("Your age is :"+age);
	System.out.println("Your college name is :"+clgname);
	System.out.println("Your roll no is :"+roll);
}
}
