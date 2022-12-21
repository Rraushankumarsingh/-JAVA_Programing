package programing;
import java.util.Scanner;
public class Automorphic
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int  n =sc.nextInt();
	boolean  rs=isautomorphic(n);
	if(rs==true)
		System.out.println(n +"is the automphir");
	else
		System.out.println(n + "is the not a automphor");
	
}

 static boolean isautomorphic(int n)
 {
     int sq=n*n;
     do {
        if(sq%10!=n%10)
        	return false;
        n=n/10;
        sq=sq/10;
     }while(n!=0);
     return true;
}
}