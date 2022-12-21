import java.util.Scanner;
public class MargeArraya
{
public static void main(String[] args) {
	System.out.println("read the first arrays");
	int a[]=readArrays();
	System.out.println("enter a second arrays");
	int b[]=readArrays();
	System.out.println("enter the first element");
	displayArrays(a);
	System.out.println("enter a second element");
	displayArrays(b);
	 System.out.println("margearraya");
	 display(c);
	
	
}
  static int[]  margrArrays(int[] a,int[] b) 
  {
	int c[]=new int[a.length+b.length];
	for(int i=0;i<a.length;i++)
	{
		c[i]=a[i];
	}
	for(int i=0;i<b.length;i++)
	{
		c[i+a.length]=b[i];
	}
	return c;
}
static void displayArrays(int[] arr)
 {
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
 }
 static int[] readArrays() 
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the size of an arrays");
  int n=sc.nextInt();
  int arr[]=new int[n];
  System.out.println("enter a "+n+"inter a valau");
  for(int i=0;i<arr.length;i++)
  {
	  arr[i]=sc.nextInt();
  }
return arr;
}
}
