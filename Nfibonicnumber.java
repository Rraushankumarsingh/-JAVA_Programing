package programing;
import java.util.Scanner;
public class Nfibonicnumber 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
  Printfib(n);
  sc.close();
}
 static void Printfib(int n) {
	int f1=0;
	int f2=1;
	while(n>0) 
	{
		System.out.println(f1+"");
		int f3=f1+f2;
		f1=f2;
		f2=f3;
		n--;
	}
	
}
}
    

