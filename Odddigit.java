import java.util.Scanner;
public class Odddigit
{
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int odd=0;
	while(n>0) 
	{
		int d=n%10;
		if(d%2==1)
		{
			odd++;
		}
		n=n/10;
		
	}
	System.out.println(odd);
}
}
