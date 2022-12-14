
public class Deletearrays1 
{
public static void main(String[] args) {
	int arr[]= {10,20,30,50,60};
  arr=	deletearrays(arr ,2);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}

 static int[] deletearrays(int[] arr, int index)
 {
	int y[]=new int[arr.length-1];
	if(index<0||index>arr.length)
	{
		System.out.println("element not present in the arrays");
	return arr;
	}
	for(int i=0;i<y.length;i++)
	{
		if(i<index)
			y[i]=arr[i];
		else
			y[i]=arr[i+1];
		
	}return y;
	
}
}
