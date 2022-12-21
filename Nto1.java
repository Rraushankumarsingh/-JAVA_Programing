//import java.util.Scanner;
public class Nto1 
{
public static void main(String[] args) 
{
	System.out.println("hello");
	//Scanner sc=new Scanner(System.in);
	//int n =sc.nextInt();
	  display(5);
	 //System.out.println(rs);
}
static int display(int n)
{
	//System.out.println(n);
	if(n==1)
	n=	display(n-1);
	return n; 
	//return (n-1);
	  
	
}

}

