package foreachloop;

import java.util.ArrayList;

public class ForEachLoop {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(20);
	al.add(10);
	al.add(null);
	al.add(10);
	al.add(null);
	for(Object a:al)
	{
		System.out.println(a);
	}
	System.out.println("-------------");
	int[] arr= {2,3,4,5,6,7,8,7};
	for(int a:arr)
	{
		System.out.println(a);
	}
}
}
