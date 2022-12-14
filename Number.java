//q=153
//o/p=100+50+3
import java.util.Scanner;
public class Number 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n =sc.nextInt();
	String str=" ";
	int r=1;
	while(n!=0)
	{
		int d=n%10;
		str=(r*d)+"+"+str;
		r=r*10;
		n=n/10;
	}
	System.out.println(str);
	sc.close();
}
}
