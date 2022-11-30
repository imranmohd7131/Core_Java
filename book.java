package constructor;

class book {
int price=100;
String title="Java";
public book()
{
	
}
public static void main(String[] args) {
	book ob=new book();
	System.out.println(ob.title);
	System.out.println(ob.price);
	
}
}
