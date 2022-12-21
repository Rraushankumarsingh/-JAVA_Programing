import java.util.Scanner;

public class Arrays
{
public static void main(String[] args)
{
	System.out.println("enter a size of an arrys");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("enter the element ");
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	
	}
	//System.out.println(arr[i]);}
	//int arr[]= {45,25,14,36,65};
	System.out.println("using for each loop");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
		//4
		sc.close();
	}
	System.out.println();
	
	}
}
