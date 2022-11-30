package string;
import java.util.Scanner;
public class string_at_indexed {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("------in Single loop---------------------------");
	System.out.println("Enter string");
	String st=sc.nextLine();
	char[] ch=new char[st.length()];
	for(int i=0;i<=st.length()-1;i++)
	{
		ch[i]=st.charAt(i);
		System.out.print(ch[i]);
	}System.out.println(ch[20]);
	
	System.out.println("\n------------------------------------");
	System.out.println("Enter a string");
	String str2=sc.next();
	for(int i=0;i<=str2.length()-1;i++)
	{
		System.out.print(str2.charAt(i));
	}  System.out.println(" "+str2.charAt(7));
	
	System.out.println("---------------------------------------------------");
	System.out.println("Enter a string");
	String str=sc.next();
	char[] arr=new char[str.length()];
	for(int i=0;i<=str.length()-1;i++)
	{
		arr[i]=str.charAt(i);
	}
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]);
	}  System.out.println(" "+arr[7]);

 }
}
