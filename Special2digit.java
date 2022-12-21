import java.util.Scanner;
public class Special2digit 
{
	public static void main(String[] args) {
	 int n=5;
	 if(n<10||n>99)
	 {
		 System.out.println("number is invilate");
	 }
	 else
	 {
		  int first =n%10;
		  int last=n/10;
		  int sum =(first+last);
		  int multi=(first*last);
		  
	 
	 if(sum+multi==n)
		 System.out.println(n +" is the special two digit number");
	 else
	 		 System.out.println(n+" is a not two digit numbaer");
	 }
}
}