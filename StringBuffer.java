package string_class;
import java.io.*;
public class StringBuffer {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Tech");
		str.append("Vidvan"); 
		System.out.println(str);
		str.append(0); 
		System.out.println(str); 

}
}
