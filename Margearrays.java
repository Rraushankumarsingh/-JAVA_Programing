import java.util.Scanner;
public class Margearrays
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("size of an arrays");
	int n=sc.nextInt();
	System.out.println("enter a first arrays");
	int a[]=new int[n];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	//System.out.println("enter a second arrays");
	System.out.println("size of an arrays");
	int x=sc.nextInt();
	System.out.println("enter a second arrays");
	int b[]=new int[x];
	for(int i=0;i<b.length;i++)
	{
		b[i]=sc.nextInt();
	}
	int[] mrg=new int[a.length+b.length];
	for(int i=0;i<mrg.length;i++)
	{
		mrg[i]=a[i];
	}
	for(int i=0;i<mrg.length;i++)
	{
		mrg[i+a.length]=b[i];
	}
	
System.out.println(mrg);

}
}
