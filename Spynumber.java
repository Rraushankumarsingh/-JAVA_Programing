import java.util.Scanner;
public class Spynumber 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int largest =large(a,b,c);
    System.out.println(largest+" largest number");
	boolean rs=isspy(largest);
	if(rs==true)
		System.out.println(largest+" is the spy number");
	else
		System.out.println(largest+" is the  not spy number");
	System.out.println("sush");
	sc.close();
}

 static boolean isspy(int largest) 
{ 
	int sum=0;
	int product=1;
	while(largest!=0)
	{
		int d=largest%10;
		sum=sum+d;
		product=product*d;
		largest=largest/10;
	}
	if(sum==product)
		return true;
	else
		return false;
	
}
 static int large(int a, int b, int c) 
{  
	if(a>b&&a>c)
	return a;
	else if(b>c)
		return b;
	else
		return c;
}


}
