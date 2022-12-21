package programing;
import java.util.Scanner;
public class Dectobinary
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number ");
	int n=sc.nextInt();
	String rs=isbinary(n);
	String ra=isocta(n);
	String rb=isdecimal(n);
System.out.println(n+" is "+rs);
System.out.println(n+" is "+ra);
System.out.println(n+" is "+rb);
}

private static String isdecimal(int n)
{
	String hex="";
	do {
		int d=n%16;
		if(d<10)
			hex=hex+d;
		else if(d==10)
			hex="A"+hex;
		else if(d==11)
			hex="B"+hex;
		else if(d==12)
			hex="C"+hex;
		else if(d==13)
			hex="D"+ hex;
		else if(d==14)
			hex="E"+hex;
		n=n/10;
	}while(n!=0);
	return hex;
}

private static String isocta(int n) {
	String rs="";
	do {
		int d=n%8;
		rs=rs+d;
		n=n/8;
	}while(n!=0);
	return rs;
}

private static String isbinary(int n) {
	String rev="";
	do {
		int d=n%2;
		rev=rev+d;
		n=n/2;
		
	}while(n!=0);
	return rev;
}
}
