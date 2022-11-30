package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Use_Iterator {
public static void main(String[] args) {
	LinkedList al = new LinkedList();
	al.add(10);
	al.add(20);
	al.add(10);
	al.add(null);
	al.add(10);
	al.add(null);
	Iterator it=al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
