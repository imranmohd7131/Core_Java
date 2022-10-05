package abstraction;

public class Tom implements Person{

	@Override
	public void eat() {
		System.out.println("Tom is eating");		
	}
	
	public static void main(String[] args) {
		Person obj = new Tom();
		obj.eat();
	}

}
