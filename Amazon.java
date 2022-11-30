package mythread;

public class Amazon {
	synchronized public void checkOut(String paymentMode) {
		System.out.println("Paying using "+paymentMode);
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Payment done using "+paymentMode);
	}
}
