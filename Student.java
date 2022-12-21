
public class Student 
{
 
	int id;
	String name;
	double per;
	public Student(int id,String name,double per)
	{
		this.id=id;
		this.name=name;
		this.per=per;
	}
	public String toString()
	{
		return this.id+""+this.name+""+this.per;
	}
}

