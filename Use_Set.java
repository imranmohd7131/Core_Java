package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Use_Set {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet hs = new HashSet();
		System.out.println("enter 5 inputs");
		/*for(int i =1;i<=5;i++)
		{
			String num = sc.next();
			hs.add(num);
		}*/hs.add(5);
		hs.add("java");
		hs.add('d');
		hs.add("null");
		hs.add("null");
		hs.add(5.8);
		for(Object a : hs)
		{
			System.out.println(a);
		}
		System.out.println("---------------------------");
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}	
	}
}
