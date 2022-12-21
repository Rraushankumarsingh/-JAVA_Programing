package programing;
import java.util.Scanner;
public class digimearnumber 
{
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n =sc.nextInt();
	boolean rs=isArmostrong(n);
	if(rs==true)
	System.out.println(n+"is the armstrong number");
	else
		System.out.println(n+"is not a armstrong");
   }

static boolean isArmostrong(int n)
   {
	int sum=0;
	int temp=n;
  int dc=countdigit(n);
  while(n!=0)
  {
	  int d=n%10;
	  sum=sum+pow(d,dc);
	  dc--;
	  n=n/10;
  }
  
	  return sum==temp;
 
   }

 private static int countdigit(int n) 
   {
	int count=0;
	do 
	{
		count++;
		int d=n/10;
		
	}while(n!=0);
	return count;
   }
  static int pow(int n,int p)
     {
	  int pow=1;
	  while(n>0)
	  {
		  pow=pow*n;
		  p--;
	  }
	  return pow;
    }
   
}
