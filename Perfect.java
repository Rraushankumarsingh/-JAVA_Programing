import java.util.Scanner;
public class Perfect
{
    static boolean cheakperfect(int x) 
    {
   
    int sum=0;
    	for(int i=1;i<=x/2;i++) 
    	{
    	   if(x%i==0)
    		  sum=sum+i;
    	}
    	if(sum==x)
    		return true;
    	else 
    		return false;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int x=sc.nextInt();
		boolean rs=cheakperfect(x);
		if(rs==true)
			System.out.println(x+ " is the perfect number ");
		else 
			System.out.println(x+" is not a perfect number");
		sc.close();
	}
}
