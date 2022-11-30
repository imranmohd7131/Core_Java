package calculator;
import java.util.Scanner;
class calculator {
	public void add(int a ,int b)
	{
	    int c=a+b;
		System.out.println("Sum of"+" "+a+" and "+""+b+" is : "+c);
	}
	public void sub(int a ,int b)
	{
	    int c=a-b;
		System.out.println("subtraction of"+" "+a+" and "+""+b+" is : "+c);
	}
	public void mul(int a ,int b)
	{
	    int c=a*b;
		System.out.println("Multiplication of"+" "+a+" and "+""+b+" is : "+c);
	}
	public void div(int a ,int b)
	{
	    int c=a/b;
		System.out.println("Division of"+" "+a+" and "+""+b+" is : "+c);
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of first number:");
	int a=sc.nextInt();
	System.out.println("Enter value of second number:");
	int b=sc.nextInt();
	calculator obj=new calculator();
	obj.add(a,b);
	obj.sub(a,b);
	obj.mul(a,b);
	obj.div(a,b);
	sc.close();
}
}
