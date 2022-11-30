package inheritance;
	//Multi level inheritance
 class Test2 {
   public static void main(String[] args) {
	   Father obj=new Father();
	   System.out.println(obj.age);
	   obj.lendmoney();
	   Daughter obj2=new Daughter();
	   System.out.println(obj2.age);
	   obj2.lendmoney();
	   obj2.study();
}
	
}
