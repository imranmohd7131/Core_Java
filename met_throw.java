package exception;

public class met_throw {
 public static void main(String[] args) {
	System.out.println("hello");
	System.out.println(10/1);
	System.out.println("hey");
	String str="java";
	try {
		System.out.println(str.charAt(5));
	
	}catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("out of");
	}
	try{
		System.out.println(10/0);	
	}
	catch(ArithmeticException e)
	{
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	finally
	{
		System.out.println("helllo");
	}
	System.out.println("Bye");
}
}
