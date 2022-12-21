
public class Arrays1 {
public static void main(String[] args) {
	int arr[]= {45,15,25,75,10};
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println(sum);
	double per=(sum/arr.length);
	System.out.println(per);
}
}
