import java.util.*;
public class Main 
{
public static void main(String[] args) {
	Object[] obj= {"rausha",'r',true,8,10,1,5,8};
	int a[]=new int[obj.length];
	for(int i=0;i<obj.length;i++)
	{
	    if(obj[i] instanceof Integer)
	    	a[i]=(int)obj[i];
	}
	System.out.println(Arrays.toString(a));
	int sum=0;
	for(int i=0;i<a.length;i++)
	{  
		int count=0;
		for(int j=0;j<a.length;i++)
		{
			if(a[i]==a[j]);
			count++;
		}
		if(count==1)
			sum=sum+a[i];
	}
	System.out.println(sum);
}
}
