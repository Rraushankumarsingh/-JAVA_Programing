package programing;
import java.util.Scanner;
public class Perfectnumber
{public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	boolean rs=isperfect(n);
	if(rs)
		System.out.println(n+" is the perfect number");
	else
		System.out.println(n+" is not a perfect number");
	
}

 static boolean isperfect(int n) 
 {
	 int sum=0;
	for(int i=1;i<=n/2;i++)
	{
		if(n%i==0)
			sum=sum+i;
		
	}
	return sum==n;
}

}
