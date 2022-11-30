package test;

public class sub_class extends abstract_class{

	@Override
	void run() {
		System.out.println("sub class");
		
	}
	sub_class()
	{
		super();  //sub class constructor call super class constructor using super calling statement
	}
	public static void main(String[] args) {
		sub_class obj = new sub_class();
	}

}
