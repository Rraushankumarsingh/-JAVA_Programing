import java.util.Scanner;
public class CheakPrime
{
 
	static boolean  cheakprime(int x) {
		for (int i = 2; i<=x/2; i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int x=sc.nextInt();
		
		for (int i = 1; i <=x; i++)
		{
		
		 boolean rs=cheakprime(i);
		  
		 if(rs)
			
		 System.out.println(i+ " the   prime number");
		
		
		}
	sc.close();
	}
	
		
	}