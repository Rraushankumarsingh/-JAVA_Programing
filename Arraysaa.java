import java.util.Scanner;
public class Arraysaa 
{
public static void main(String[] args)
{
	System.out.println("enter the size of an arrays");
    Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     System.out.println("enter a element od an arrays");
   int[] arr=new int[x];
   for(int i=0;i<arr.length;i++)  
   {
	   arr[i]=sc.nextInt();
	   
   }
   int dc=countdigit(arr);
   System.out.println(dc);
	sc.close();

}

 static int countdigit(int[] arr)
 { 
	 int count=0;
	 for(int i=0;i<arr.length;i++)
	 {
		 boolean rs=isprime(arr[i]);
		 
		 if(rs==true)
		 {
			 count++;
		 }
	 }return count;
	
}
 static boolean isprime(int x)
 {
	for(int i=2;i<x/2;i++) {
		if(x%i==0)
			return false;
	}return true;
}
}
