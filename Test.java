package inheritance;
           //Single level inheritance
class Test {
	public static void main(String[] args) {
		Child obj=new Child();
		System.out.println(obj.age);
        System.out.println(obj.roll);
        obj.run();
        obj.speed();
        
	}
}
