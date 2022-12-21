import java.util.*;
public class Sun
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an arrays");
	int n=sc.nextInt();
	String[] a=new String[n];
	
	for(int i=0;i<a.length;i++)
	
		a[i]=sc.next();
	System.out.println("enter the finding string");
	  String s=sc.next();
	  boolean rs=substring(a,s);
	if(rs)
		System.out.println("true");
	else
		System.out.println("false");
}

 static boolean substring(String[] a, String s) 
 {
	for(int k=0;k<=a.length;k++)
	{
		if(a[k].contains(s))
			continue;
		else {
			return false;
		}
	}
	return true;
}
}
