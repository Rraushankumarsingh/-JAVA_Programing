import java.util.Scanner;
public class DeleteArraya 
{
	public static void main(String[] args)
	{
	int arr[]= {10,50,0,45,50};
	//int arr=arrayreverse(arr);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}


	 void arrayreverse(int[] )
			 
	 {
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			int temp=0;
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}


