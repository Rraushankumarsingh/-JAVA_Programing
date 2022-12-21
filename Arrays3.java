import java.util.Scanner;
public class Arrays3 
{
	public static void main(String[] args) {
		System.out.println("sizze of an arrays");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("enter a element");
		int arr[]=new int[x];
		for(int i=0;i<=x;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<x;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("big is the"+max);
		for(int i=0;i<=x;i++)
		{
			System.out.println(arr[i]);
		sc.close();
		}
		
	}
	
	}


