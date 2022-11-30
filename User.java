package mythread;

public class User {
	public static void main(String[] args) {
		Amazon obj=new Amazon();
		Payment t1=new Payment("Paytm",obj);
		Payment t2=new Payment("Gpay",obj);
		Payment t3=new Payment("PhonePe",obj);
		t1.start();
		t2.start();
		t3.start();
	}
}
