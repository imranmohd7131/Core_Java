package string;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a String:");
		String  str=ob.nextLine();
		String s2="";
		System.out.println("-----------------------------------");
		for(int i=str.length()-1;i>=0;i--)
		{
			s2=s2+str.charAt(i);
		}
		if(str.equals(s2))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		/*String original, reverse = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("to check enter string or number is palindrome");
        System.out.println("Enter String or no.");
        original = sc.next();
        for (int i =original.length()-1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        //System.out.println(" ");*/
	}
}
