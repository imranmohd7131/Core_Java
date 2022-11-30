package constructor;

class book2 {
	int price;
	String title;
	public book2(int n,String s)
	{
		price=n;
		title=s;
	}
	public static void main(String[] args) {
		book2 ob=new book2(200,"SQL");
		System.out.println(ob.title);
		System.out.println(ob.price);
		book2 ob2=new book2(100,"LET US C");
		System.out.println(ob2.title);
		System.out.println(ob2.price);
}
}
