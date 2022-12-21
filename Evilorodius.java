package programing;
import java.util.Scanner;
public class Evilorodius 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	boolean rs=isevilorodios(n);
	if(rs)
		System.out.println(n+" is the evil number");
	else
		System.out.println(n+" is a odius number");
	
}
 static boolean isevilorodios(int n)
 {
	int count=0;
	do {
		int d=n%2;
		if(d==1)
			count++;
		n=n/2;
	}while(n!=0);
	return count%2==0;
}
}
