package programing;
import java.util.Scanner;
public class Breakup 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	if(n%3==0&&n%5==0) 
	
		System.out.println("sanju weds geeta");
		
	else if(n%3==0) 
	
		System.out.println("sajnu");
	
	else if(n%5==0)
	{
		System.out.println("geeta");
	}
	else
		
	System.out.println("breakup");
}
}
