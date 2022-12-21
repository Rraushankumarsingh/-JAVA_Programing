package programing;
import java.util.Scanner;
public class Isprime
{
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;n>0;i++)
	{
		boolean rs=isprime(i);
		if(rs==true)
		
			System.out.println(i+" ");
			n--;
		
	}
	sc.close();
}

private static boolean isprime(int n)
{
	for(int i=2;i<=n/2;i++) 
	{
		if(n%i==0)
		
			return false;
		
	}
	return true;
}
}
