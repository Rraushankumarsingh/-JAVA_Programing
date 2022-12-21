import java.util.Scanner;
public class Arrays 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a size of an arrayss");
	int n=sc.nextInt();
	System.out.println("enter a elemet of arrays");
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int even=0;
	int odd=0;
	for(int i=0;i<arr.length;i++)
	{
		if(i%2==0)
			even++;
		else
			odd++;
	}
	
	System.out.println(even);
	System.out.println(odd);
	sc.close();
}
}
