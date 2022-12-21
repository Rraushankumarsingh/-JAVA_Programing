import java.util.*;
import java.util.ArrayList;
public class Test
{
public static void main(String[] args)
{
	Student s1=new Student(1," raj ",85.20);
	Student s2=new Student(2," raju ",86.20);
	Student s3=new Student(3," rajesh ",82.20);
	Student s4=new Student(4," rajnesh ",80.20);
	ArrayList<Student> li=new ArrayList<Student>();
	li.add(s1);
	li.add(s2);
	li.add(s3);
	li.add(s4);
	li.add(s1);
	li.add(s2);
	
Comparator<Student> com=new Comparator<Student>() {
		
		@Override
		public int compare(Student o1, Student o2) {
			return -((Double)o1.per).compareTo(o2.per);
		}
	};
	Collections.sort(li ,com);
	for(Student s:li)
	{
		System.out.println(s);
	}
}
}
