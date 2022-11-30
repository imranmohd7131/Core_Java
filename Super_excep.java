package exception;

public class Super_excep {
public static void main(String[] args) {
	try{
	System.out.println(10/2);
	System.out.println(10/1);
	System.out.println(10/0);
	}catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("not");
	}catch(Exception e)          //super class exception
	{
		System.out.println(e.getMessage());
	}
}
}
