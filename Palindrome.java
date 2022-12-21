package programing;
import java.util.Scanner;
public class Palindrome
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enteer a number");
	int n=sc.nextInt();
	int sum=0;
	int temp=n;
	
	while(n!=0)
	{
		int d=n%10;
		sum=sum*10+d;
		n=n/10;
	}
	if(sum==temp)
		System.out.println(sum + "is the palindroem number");
	else
		System.out.println(sum + "is not a palindeome number");

}
}