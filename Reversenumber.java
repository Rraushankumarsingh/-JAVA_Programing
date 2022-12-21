import java.util.Scanner;
public class Reversenumber 
{
     public static void main(String[] args) 
     {System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//1542
		int reverse=0;
		while(n!=0)
		{
			int d=n%10;
			reverse=reverse*10+d;//2//24//245//2451
			n=n/10;
		}
		System.out.println(reverse);
	}
}
