
public class Arraysbig {
public static void main(String[] args) {
	int  arr[]= {12,10,20,15,35};
	int big=arr[0];
	for(int i =1;i<arr.length;i++)
	{
	  if (arr[i]>big)
		  big=arr[i];
	}
	System.out.println(big);
}
}
