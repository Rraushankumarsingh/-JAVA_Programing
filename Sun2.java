import java.util.*;
public class Sun2 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an arrays");
		int n=sc.nextInt();
		String[] a=new String[n];
		
		for(int i=0;i<a.length;i++)
		
			a[i]=sc.next();
		String s="";
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i].charAt(j)==a[i+1].charAt(j))
					s=s+a[i].charAt(j);
				else
					break;
			}
			if(!(s.isEmpty()))
				break;
		}
		for(int k=2;k<a.length;k++)
		{
			if(a[k].contains(s))
			continue;
			else 
			{
				s="";
				break;
			}
		}
		System.out.println(s);
}
}
