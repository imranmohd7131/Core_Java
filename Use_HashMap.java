package map;

import java.util.HashMap;
import java.util.Set;

public class Use_HashMap {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("key2", "java");   // key2 is key name
		hm.put("key1", 90);   // key1 is key name
		hm.put(1, 90);  // 1 is key name
		hm.put(3, "java");   // 3 is key name
		System.out.println(hm.get(3));// in get method pass key name
		System.out.println(hm);
		//hm.clear();
		System.out.println(hm.isEmpty());
		System.out.println(hm.remove(3));
		System.out.println(hm);
		System.out.println(hm.containsKey("key1"));
		System.out.println(hm.containsValue("java"));
		System.out.println(hm.keySet());
		Set keys = hm.keySet();
		System.out.println(keys);
		for(Object key:keys)
		{
			System.out.println(key+"  "+hm.get(key));
		}
	}
}
