package file_handling;

import java.io.Serializable;

public class Student implements Serializable{
	int roll;
	String name;
	int age;
	public Student(int roll,String name,int age)
	{
		this.roll=roll;
		this.name=name;
		this.age=age;
	}
}
