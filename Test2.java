package encapsulation;

public class Test2 {
	public static void main(String[] args) {
		person obj =new person();
		System.out.println(obj.getAge());
		obj.setAge(40);
		System.out.println(obj.getName());
		System.out.println(obj.getAadhar());
		System.out.println(obj.getPhone());
		obj.setPhone(2343235673L);
	}
}
