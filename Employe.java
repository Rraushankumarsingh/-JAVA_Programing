
public class Employe implements Comparable<Employe> 
{
int id;
String name;
Double per;
 public Employe(int i,String n,Double s)
 {
	 this.id=i;
	 this.name=n;
	 this.per=s;
 }
	@Override
	public int compareTo(Employe o) {
		return ((Double)this.per).compareTo(o.per);
	}
	public String toString()
	{
		return this.id +""+this.name+""+this.per;
	}

}
