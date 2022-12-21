package programing;
import java.util.Scanner;
public class Main 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value");
	int n =sc.nextInt();
	for(int i=1;n>0;i++) {
		boolean rs=isprime(i);
	if(rs==true)
		
		System.out.print(i+" ");
	n--;
	}
	sc.close();
}

static boolean isprime(int n)
{
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
			return false;
	}
	return true;
}
}
