package comparable;

import java.util.Comparator;

public class Sort_By_Name implements Comparator<Student_1>{

	@Override
	public int compare(Student_1 o1,Student_1 o2) {
		return o1.name.compareTo(o2.name);
		//return o1.roll-o2.roll;
	}

}
