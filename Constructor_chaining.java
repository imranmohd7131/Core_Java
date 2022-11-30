package constructor;

 class Constructor_chaining {
	 String color;
	 double price;
	 String brand;
	 String fuelType;
	 public Constructor_chaining(String color,String brand,double price)
	 {
		 this(color,brand);
		 this.price=price;
		 System.out.println("1");
	 }
	 public Constructor_chaining(String color,String brand,double price,String fuelType)
	 {
		 this(color,brand,price);
		 this.fuelType=fuelType;
		 System.out.println("2");
	 }
	 public Constructor_chaining(String color)
	 {
		this.color=color; 
		System.out.println("3");
	 }
	 public Constructor_chaining(String color,String brand)
	 {
		 this(color);
		 this.brand=brand;
		 System.out.println("4");
	 }
public static void main(String[] args) {
	Constructor_chaining ob=new Constructor_chaining("red","BMW",150.0,"petrol");
	System.out.println(ob.color);
}
}
