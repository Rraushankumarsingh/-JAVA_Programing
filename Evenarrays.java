import java.util.Scanner;

public class Evenarrays 
{
public static void main(String[] args) 
{
	System.out.println("enter a size of an arrays");
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	System.out.println("enter a size of an arrys");
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		}
	System.out.println();
    int even=0;
	int odd=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
			even++;
		else
			odd++;
	}
	System.out.println(even+"is the even number present in the arrays");
	System.out.println(odd+"odd numbaer present in the arreya");
	sc.close();
}
}