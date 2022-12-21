import java.util.Scanner;
public class Arstrong
{
     static int countdigit(int n)
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
    	 while(p>0) 
    	 {
    		pow=pow*n;
    		p--;
    	 }
    	 return pow;
     }
     static boolean cheakarmstrong(int n)
     {
    	int sum=0,temp=n; 
     int dc=countdigit( n);
       while(n>0) 
       {
     int d=n%10;
     sum =sum+pow(d,dc);
     n=n/10;
       }
     
     
     return sum==temp;
     		 
     }  
     public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number :");
		int n=sc.nextInt();
		boolean rs=cheakarmstrong(n);
		System.out.println(rs);
	sc.close();
	}
    
}
