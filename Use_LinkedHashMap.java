package map;

import java.util.LinkedHashMap;

public class Use_LinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(10,"Shubham");
		lhm.put(1,"Sh");
		lhm.put(0,"Shubham");
		lhm.put(90,"Shubham");
		System.out.println(lhm);
		//lhm.clear();
		System.out.println(lhm.get(0));
	}
}
