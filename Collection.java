import java.util.*;
public class Collection 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> li=new ArrayList<Integer>();
	li.add(10);
	li.add(11);
	li.add(17);
	li.add(19);
	li.add(12);
	 
	for(int i=0;i<li.size();i++)
	{
		System.out.print(li.get(i)+" ");
	}
	System.out.println();
	System.out.println("advance loop");
	for(Integer i:li)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	System.out.println("iterator");
	//System.out.println();
	
	Iterator <Integer> ltr=li.iterator();
	while(ltr.hasNext())
	{
		System.out.print(ltr.next()+" ");
	}
}
}
