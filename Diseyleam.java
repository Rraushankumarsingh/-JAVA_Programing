import java.util.Scanner;

public class Diseyleam 
{
	static int countdigit(int x)
	{
		int count=0;
		do {
			count++;
			x=x/10;
			}while(x!=0);
		return count;
	}
	static int pow(int n,int p)
	{
		int pow=1;
		while(n>0) 
		{
			pow=pow*n;
			p--;
		}
		return pow;
	}
	static boolean cheakdiseyleam(int x)
	{
		int sum=0;
		int temp=x;
		int dc=countdigit(x);
		do {
			int d=x%10;
			sum=sum+pow(d,dc);
			dc--;
			x=x/10;
			}while(x!=0);
	
		if(sum==temp)
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int x=sc.nextInt();
		boolean rs=cheakdiseyleam(x);
		System.out.println(rs);
		sc.close();
	}
}
