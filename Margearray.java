//import java.util.Scanner;
public class Margearray
{
public static void main(String[] args) 
{
	int a[]= {10,20,30,40,50};
	int b[]= {20,50,60,80};
	int c[]=new int[a.length+b.length];
	System.out.println(c.length);

	for(int i=0;i<a.length;i++)
	{
		c[i]=a[i];
		
	}
	for(int i=0;i<b.length;i++)
		
	{
		c[a.length+i]=b[i];
				
	}
	System.out.println("margine arrays");
	for(int i=0;i<c.length;i++)
	{
		System.out.println(c[i]);
	}
}
}
