import java.util.Scanner;
public class Searcharrys 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	System.out.println("enter a arrsya element");
	int[] arr =new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("enter a search element");
	int ele =sc.nextInt();
	
	int dc=searchelememt(arr ,ele);
	if(dc==-1)
		System.out.println("element not in the arrays");
	else
		System.out.println("index is "+dc);
	sc.close();
	}


 static int searchelememt(int[] arr,int ele) 
 {
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==ele)
			return i;
		
	}
	return -1;
}
}

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 