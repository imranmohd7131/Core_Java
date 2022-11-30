package vector;

import java.util.Iterator;
import java.util.Vector;

public class Use_Vector {
	public static void main(String[] args) {
	Vector ve = new Vector();
	ve.add(10);
	ve.add(20);
	ve.add("java");
	ve.add("java");
	ve.add('a');
	
//	for(Object a : ve)
//	{
//		System.out.println(a);
//	}

	Iterator it = ve.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());			
	}
	}
}
