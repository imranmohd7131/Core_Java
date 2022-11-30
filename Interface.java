
//Interface
public interface Interface{
	 void r();       //by default public abstract
	default void a()   //since java 8 default methods
	{
		System.out.println("k");
	}
	static void ab()    //since java 8 static methods
	{
		System.out.println("k");
	}
	
	default void show()     // Multiple Inheritance
	{
		System.out.println("1");
	}
}
