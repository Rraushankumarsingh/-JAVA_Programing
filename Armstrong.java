import java.util.Scanner;
public class Armstrong 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	boolean rs=isarmstrong(n);
	if(rs)
		System.out.println(n+"is the armstong");
	else
		System.out.println(n+"not a armstrong");
}
  static boolean isarmstrong(int n) 
  { int dc=countdigit(n);
   int sum=0;
   int temp=n;
          do {
        	  int r=n%10;
        	 sum=sum+pow(r,dc); 
        	 n=n/10;
          }while(n!=0);
          return sum==temp;
	
}
static int countdigit(int n) 
	 {
	  int count=0;
	  do {
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
