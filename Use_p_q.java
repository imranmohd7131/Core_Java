package priority_queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Use_p_q {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add("java");
		pq.add("c");
		pq.add("python");
		pq.add("hello");
		
		//pq.clear();
		/*Iterator it=pq.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}*/
	 //System.out.println(pq.element());
		 System.out.println(pq);
	 System.out.println(pq.peek());
	 System.out.println(pq.remove());
	 System.out.println(pq);
		 
		 System.out.println(pq.poll());
		 System.out.println(pq);
	}
}
