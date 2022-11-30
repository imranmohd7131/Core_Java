package test;

public abstract class abstract_class {
   abstract void run();         //abstract method
   
   static int run(int n)    //concrete methods
   {
	   System.out.println("hh");
	   return n;
   }
   final static int a=20;    //final and static variable
   int ab=20;    //non-final and non-static variable
  
   public abstract_class() //constructor 
   {
	   System.out.println("jk");
   }
   protected void r()    //concrete methods
   {
	   System.out.println("hh");
   }
   
}
