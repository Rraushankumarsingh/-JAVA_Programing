
public class Arrays2 
{
	public static boolean isshotade(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[i-1])
				return false;
		}
		return true;
	
	}

	
public static void main(String[] args) {
	int arr[]= {2,3,4,5,8,9};
	boolean rs=isshotade(arr);
	if(rs)
	System.out.println("arrays is shotsted");
	else
		System.out.println("arrays is not shotade");
	
}
}
