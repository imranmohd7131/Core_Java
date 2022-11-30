package map;

import java.util.Set;
import java.util.TreeMap;

public class Use_TreeMap {
public static void main(String[] args) {
	TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
	tm.put(6, "Ashish");
	tm.put(50, "shish");
	tm.put(0, "Nik");
	System.out.println(tm);
	Set s=tm.keySet();
	for(Object o:s)
	{
		System.out.println(o+" "+tm.get(o));
	}
}
}
