package programing;
import java.util.Scanner;
public class Aramstrong
{
	static int countdigit(int n)
	{
		int count=0;
		do {
			n=n/10;
			count++;
			
		}while(n!=0);
		return count;
	}
	static int pow(int n ,int p)
	{
		int pow=1;
		while(p>0)
		{
			pow=pow*n;
			p--;
		}
		return pow;
	}
	
	static boolean isArmstrong(int n)
	{
		int sum=0;
		int temp=n;
		int dc=countdigit(n);
		
		
		do{
			int d=n%10;
			sum=sum+pow(d,dc);
			n=n/10;
			}while(n!=0);
		return sum==temp;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		boolean rs=isArmstrong(n);
		if(rs==true)
			System.out.println(n + "   is the amrstrong  number");
		else
			System.out.println(n + " is not a armstrong number");
		sc.close();
	}
}