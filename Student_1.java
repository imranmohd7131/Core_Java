package comparable;

import java.util.TreeSet;

public class Student_1 implements Comparable<Student_1>{
	int roll;
	String name;
	public Student_1(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}

	@Override
	public String toString() {
		return "[roll ="+roll+",name ="+name+"]";
	}

	@Override
	public int compareTo(Student_1 o)
	{
		
		  if(this.roll > o.roll) {
			  return 1; 
		  }else if(this.roll<o.roll) { 
			  return -1;
		  }else {
			  return 0; }
		  
		 // return this.roll-o.roll;
		  
		 //return this.name.compareTo(o.name);
	}
	
}
