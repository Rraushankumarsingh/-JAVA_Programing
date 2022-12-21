import java.util.Scanner;
public class Lipyear
{
public static void main(String[] args) 
{ System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int yy=sc.nextInt();
	if(yy%4==0&&yy%100!=0||yy%400==0)
	
		System.out.println("leap year ");
	else
	System.out.println("not lipyear");
}
}
