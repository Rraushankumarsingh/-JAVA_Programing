import java.util.Scanner;
public class Oddequealeven 
{
  public static void main(String[] args) 
  {
	  System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int even=0;
	int odd=0;
	  while(n!=0)
	  { 
		  int d=n%10;
	  if(d%2==0)
	  
		  even++;
		  else
			  odd++;
	  
		n=n/10;  
	  }
	  System.out.println("even numbar is "+even+" "+"odd number is "+odd);
	  if(even==odd)
		  System.out.println("good");
	  else
		  System.out.println("bad");
	  sc.close();
}
}
