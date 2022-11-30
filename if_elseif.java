package conditional_statements;
import java.util.Scanner;

public class if_elseif {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter symbol");
		char c=sc.next().charAt(0);
		System.out.println("Enter first number");
		int n=sc.nextInt();
		System.out.println("Enter second number");
		int n2=sc.nextInt();
		int n3;
		
	   if(c == '+')
	   {
		   n3=n+n2;
		   System.out.println("Sum of "+n+" and "+n2+" is "+n3);
	   }
	   else if(c == '-')
	   {
		   n3=n-n2;
		   System.out.println("Sub of "+n+" and "+n2+" is "+n3);
	   }
	   else if(c == '*')
	   {
		   n3=n*n2;
		   System.out.println("Mul of "+n+" and "+n2+" is "+n3);
	   }
	   else if(c == '/')
	   {
		   n3=n/n2;
		   System.out.println("Div of "+n+" and "+n2+" is "+n3);
	   }main(args);
	}
	}