package programing;
import java.util.Scanner;
public class Factriol 
{public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	int fact=1;
	while(n>0)
	{
		fact=fact*n;
		
		System.out.print("*"+n);
		n--;
	}
	System.out.println("="+ fact);
}

}
