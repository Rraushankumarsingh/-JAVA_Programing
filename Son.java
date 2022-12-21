import java.util.*;
public class Son
{
 public static void main(String[] args)
 {
	ArrayList<Employe> li=new ArrayList<Employe>();
	Employe e1=new Employe(1, " raj ", 45.21);
	Employe e2=new Employe(2," raju ",  20.25);
	Employe e3=new Employe(3," rajesh ", 85.25);
	li.add(e1);
	li.add(e2);
	li.add(e3);
	Collections.sort(li);
	System.out.println(li);
}
}
