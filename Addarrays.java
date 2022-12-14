
public class Addarrays 
{
public static void main(String[] args) {
	int arr[]= {10,20,30,40,50};
	//int x[]= {10,20};
	arr=addarrays(arr,5,2);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
 static int[] addarrays(int[] arr, int ele, int index) 
 {
	if(ele<0&&ele>arr.length)
	{
		System.out.println("it is not present in the arrays");
		return arr;
	}
	int y[]=new int[arr.length+1];
	y[index]=ele;
	for(int i=0;i<arr.length;i++)
	{
		if(i<index)
			y[i]=arr[i];
		else
			y[i+1]=arr[i];
	}
	return y;
}
}
