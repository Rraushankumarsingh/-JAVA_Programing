import java.util.Scanner;
public class Cheakelement 
{
public static void main(String[] args) {
	System.out.println("enter a size of an arrays");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("enter a element in the arrays");
	int arr[]=new int[n];
	for(int i=0;i<n;i++) 
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("enter the element for searching");
	int ele=sc.nextInt();
	int index=searchelement(arr,ele);
	//System.out.println(index);
	if(index==0)
		System.out.println("element is not present in the arrays");
	else
		System.out.println("the element present in the index "+index);
	sc.close();
}
 static int searchelement(int[] arr, int ele) 
 {
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]==ele)
			return i;
		
	}
	return -1;
	
}
}
