import java.util.HashSet;

public class Dublecate 
{
public static void main(String[] args) {
	int arr[]= {1,6,4,7,8,4,7,9,9,3,8};
	HashSet<Integer> dc=new HashSet<>();
	boolean isdublicateexit=false;
	for(int i=0;i<arr.length;i++)
	{
		if(dc.contains(arr[i]))
		{
		
		isdublicateexit=true;
		System.out.println("dublicate element is"+arr[i]);
		}
	
	else
	  dc.add(arr[i]);
	}	
			
	
	if(!isdublicateexit)
	{
		System.out.println(-1);
	}
	
		
}
}
