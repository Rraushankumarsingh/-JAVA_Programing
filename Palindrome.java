import java.util.Scanner;
public class Palindrome
{
    static boolean cheakpalidrome(int x)
    {
    	int sum=0;
    	int temp=x;
    	do {
    		int d=x%10;
    		sum=sum*10+d;
    		x=x/10;
    	}while(x!=0);
    
    return sum==temp;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int x=sc.nextInt();
		boolean rs=cheakpalidrome(x);
		if(rs)
			System.out.println(x+ " is the palindrome number");
		else
			System.out.println(x+ " IS the not palindrome number");
		sc.close();
	}
}
