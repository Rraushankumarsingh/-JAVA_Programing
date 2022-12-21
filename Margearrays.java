import java.util.Arrays;
public class Margearrays
{
public static void main(String[] args) 
{
	int a[]= {10,20,30,40,50};
	int b[]= {20,50,40,45,62};
	int arr[]=new int[a.length+b.length];
	 System.out.println(arr);
for(int i=0;i<a.length;i++) 
	{
		arr[i]=a[i];
	}
	for(int i=0;i<b.length;i++)
	{
		arr[i+a.length]=b[i];
	}
	
 // for(int i=0;i<arr.length;i++);
 //// {
	  
//  }

}
}
