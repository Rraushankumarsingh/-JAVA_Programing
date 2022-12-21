import java.util.Scanner;
public class Arraystake
{
public static void main(String[] args) 
{   System.out.println("enter a size of first  arrays");
	Scanner sc=new Scanner(System.in);
	int  n =sc.nextInt();
	System.out.println("enter a element of first arrays");
	int[] a=new int[n];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	//int   =sc.nextInt();
	System.out.println("enter a element of second arrays");
	int[] b=new int[n];
	for(int i=0;i<b.length;i++)
	{
		b[i]=sc.nextInt();
		
	}
   int rs=addmarge();
	sc.close();
}

 static int addmarge()
 {
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		
	      for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
			System.out.print(b[i]+" ");
			System.out.println(c[i]+" ");
		}
}
}
