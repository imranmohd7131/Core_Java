
public class son extends father{
	public void study()
	{
		System.out.println("study");
	}
	public static void main(String[] args) {
		grandfather ob=new father();   //Upcasting
		ob.getAge();
		//ob.getPermission();
		father ab=(father)ob;     //Down-casting
		ab.getPermission();
		ab.getAge();
		
		father ob2=new son();     //Upcasting
		ob2.getAge();
		ob2.getPermission();
		//ob2.study();
		son ab2=(son)ob2;        //Down-casting
		ab2.getAge();
		ab2.getPermission();
		ab2.study();
				
	    grandfather ob3=new son();   //Upcasting
	    ob3.getAge();
		//ob3.getPermission();
		//ob3.study();
	    son ab3=(son)ob3;       //Down-casting
	    ab3.getAge();
		ab3.getPermission();
		ab3.study();
	    
	}
}
