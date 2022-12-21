//import java.util.Scanner;
public class Returnnp
{
      static int pow(int n, int p)
      {
    	  int pow=1;
    	 while(p>0)
    	 {
    		pow=pow*n;
    		p--;
    	 }
    	 return pow;
      }
       
      public static void main(String[] args)
      {
    	  int po=pow(10, 5);
      
    	  System.out.println(po);
      
}
}
