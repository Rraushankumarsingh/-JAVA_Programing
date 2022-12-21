import java.util.Scanner;
public class Cheakprime 
{
	public static void main(String[] args) 
	{
		System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	int prime=0;
	while(n!=0)
	{
	//int	prime=0;
	int d=n%10;
	if(d==1||d==2||d==3||d==5||d==7)
		prime++;
	n=n/10;
	
	}	
	System.out.println(prime);
}

}
