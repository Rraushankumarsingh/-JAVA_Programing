import java.util.Scanner;
public class Strongnumber
{
   static int fact(int x)
   {   
	  int fact=1;
	   while(x>1) 
	   {
		   fact=fact*x;
		   x--;
	   }
	   return fact;
   }
   static boolean cheakstrong( int x)
   {
	   int sum=0; 
	   int temp=x;
	  while(x!=0)
	  {
		   int d=x%10;
		   sum=sum+fact(d);
		   x=x/10;
	   }
	   return sum==temp;
   }
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int x=sc.nextInt();
	boolean rs=cheakstrong(x);
	if(rs)
	
		System.out.println(x+ " is the strong number");
		else
			System.out.println(x + "is not a strong number");
	sc.close();
	
}
}
