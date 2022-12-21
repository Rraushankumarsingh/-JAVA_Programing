import java.util.Scanner;
public class Chekprime
{
	public static void main(String[] args)
	{
		System.out.println("enter the size of an arrays");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("inter a element");
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		sc.close();
	
	int dc=countdigit( arr);
	System.out.println(dc);
	}
	public static int countdigit(int[] arr) 
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{ 
			boolean rs=isprime(arr[i]);
         	if(rs==true)
			count++;
						
		}return count;
		}

	 static boolean isprime(int n)
	 {
		 for(int i=2;i<n;i++)
		 {
			 if(n%i==0)
				 return false;
	 }
		 return true;
	
}

}
