
public class DeleteArrays {
public static void main(String[] args) {
	int arr[]= {40,50,40,60,70};
	arr=deletearray(arr,2);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}

 static int[] deletearray(int[] x, int index)
 {
	if(index<0 || index>x.length)
	{
		System.out.println("index not present in the arrays");
		return x;
	}
	int[] y=new int[x.length-1];
	for(int i=0;i<x.length;i++)
	{
		if(i<index)
		
			y[i]=x[i];
			else
				y[i]=x[i+1];
		
	}
	return y;
}
}
