//import java.util.*;
public class deletearrays
{
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
	int arr[]= {10,20,30,40,50};
   arr=deletearrys(arr,3);
   for(int i=0;i<arr.length;i++)
   {
	   System.out.println(arr[i]);
   }
	}

	 static int[] deletearrys(int[] arr, int index) 
	 {
	if(index<0 && index>arr.length)
	{
		System.out.println("element not present in the arr");
		return arr;
	}
	
	int y[]=new int[arr.length-1];
	for(int i=0;i<y.length;i++)
	{
		if(i<index)
			y[i]=arr[i];
		else
			y[i]=arr[i+1];
	}
	return y;
	}

}
