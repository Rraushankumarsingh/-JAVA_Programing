import java.util.Scanner;
public class Margeinzickzack 
{
public static void main(String[] args) {
	int a[]= {10,20,20,30,05};
	int b[]= {45,65,85};
	
	
	
	
	int c[]=new int[a.length+b.length];
	int i=0;
	int k=0;
	if(i<a.length&&i<b.length)
	{
		c[k]=a[i];
		k++;
		c[k]=b[i];
		k++;
		i++;
	}
	while(i<a.length)
	{
		c[k]=a[i];
		k++;
		i++;
	}
	while(i<b.length)
	{
		c[k]=b[i];
		k++;
		i++;
	}
	System.out.println(c[k]);
}
}
