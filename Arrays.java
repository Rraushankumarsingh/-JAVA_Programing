
public class Arrays {
public static void main(String[] args) {
	int arr[]= {10,20,30,50,60};
	int i=0;
	int j=arr.length-1;
	while(i<j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
System.out.println(arr[i]);
}



}
