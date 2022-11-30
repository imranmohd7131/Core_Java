package encapsulation;

public class person {
 private int age=32;
 public int getAge()
 {
	 return age;
 }
 public void setAge(int age)
 {
	 System.out.println(this.age=age);
 }
 private String name="Imran";
 public String getName()
 {
	 return name;
 }
 private long aadhar=123456789897L;
 public long getAadhar()
 {
	 return aadhar;
 }
 private long phone=2343234587L;
 public long getPhone()
 {
	 return phone;
 }
 public void setPhone(long phone)
 {
	 System.out.println(this.phone=phone);
 }
}
