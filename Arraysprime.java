import java.util.Scanner;
public class Arraysprime 
{
 public static void main(String[] args) {
	System.out.println("enter a size of an arrys");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("enter a arrays element");
	int[] arr=new int[n];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	int rs= cheakprime(arr);
	System.out.println(rs);
	
}

 static int cheakprime(int[] arr) 
 {
	 int count=0;
	 for(int i=0;i<arr.length;i++);
	 {
	      boolean rs1=isprime(arr[count]);
	  if(rs1=true)
	  
		  count++;
	  
	 }
	return count;
}

static boolean isprime(int n)
{
	   for(int i=2;i<n/2;i++)
	   {
		   if(n%i==0)
			   return false;
	   }
	   return true;
}
}
