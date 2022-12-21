import java.util.Scanner;
public class PrimenoArrays 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter a size of an arrys");
	int n=sc.nextInt();
	System.out.print("enter a element of arrays");
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int dc=primenumber(arr);
	System.out.println(dc);
	sc.close();
}

 static int primenumber(int[] arr) 
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
	for(int i=2;i<=n/2;i++)
	{
		if(n%2==0)
			return false;
		
	}return true;
}
}
