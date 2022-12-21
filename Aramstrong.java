import java.util.Scanner;

public class Aramstrong 
{
   static int countdigit(int x)
   {
	   int count=0;
	   do{
		   count++;
		    x=x/10;
	   }while(x!=0);
	   return count;
   }
   static int pow(int n, int p)
   {
	   int pow=1;
	   while(n>0) 
	   {
		   pow=pow*n;
		   p--;
	   }
	   return pow;
   }
   static boolean cheakArmstrong(int x)
   {  
	   int sum=0;
         int temp=x;
	   int dc=countdigit(x);
	   do{
		   int d=x%10;
		   sum=sum+pow(d,dc);
		   x=x/10;
	    }while(x!=0);
	   
   return sum==temp;
   }
   public static void main(String[] args) 
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int x=sc.nextInt();
	System.out.println("helloooo");
	boolean rs=cheakArmstrong(x);
	System.out.println("hello");
	if(rs==true)
		System.out.println(x +" is the armstrong number");
	else
		System.out.println(x+" is not a prime number");
	sc.close();
}
}
