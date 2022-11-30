package mythread;

public class Payment extends Thread{
	String paymentMode;
	Amazon obj;
	public Payment(String paymentMode,Amazon obj)
	{
		this.paymentMode=paymentMode;
		this.obj=obj;
	}
	@Override
	public void run()
	{
		obj.checkOut(paymentMode);
	}
}
