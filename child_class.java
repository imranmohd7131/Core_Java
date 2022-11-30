

// Multiple Inheritance
public class child_class implements Interface,Interface2{

	@Override
	public void r() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Interface.super.show();
		Interface2.super.show();
	}
	public static void main(String[] args) {
		child_class obj = new child_class();
		obj.show();
	}


}
