package programing;
import java.util.Scanner;
public class Differentbtevenorodd 
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int n=sc.nextInt();
    int even=0;
    int odd=0;
    while(n!=0)
    {
    	int d=n%10;
    	if(d%2==0)
    	even=even+d;
    	else
    		odd=odd+d;
    	n=n/10;
    }
    System.out.println(even);
    System.out.println(odd);
  if(even>odd)
	  System.out.println(even-odd);
  else
	  System.out.println(odd-even);

	sc.close();
	}
}