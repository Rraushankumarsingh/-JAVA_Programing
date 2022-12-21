package programing;
import java.util.Scanner;
public class Strongnumber 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	boolean rs=isstrong(n);
	if(rs)
		System.out.println(n+" is the strong number");
	else
		System.out.println(n+" is not a strong number");
	
}

static int  getfact(int n)
{
	int fact=1;
	while(n>0) {
		fact=fact*n;
		n--;
	}
	return fact;
}
private static boolean isstrong(int n) 
{
	int sum=0;
	int temp=n;
	do {
		int d=n%10;
		sum=sum+getfact(n);
		n=n/10;
		}while(n!=0);
	return sum==temp;
}
}
