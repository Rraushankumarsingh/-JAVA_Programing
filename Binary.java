import java.util.Scanner;
public class Binary 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	int rs= dectobin(n);
	System.out.println(rs);
	

}
 public static int dectobin(int  n) {
	int dec=0;
	int bin=1;
	
	do{
		int d=n%10;
		dec=dec+d*bin;
		bin=bin*2;
		n=n/10;
		
	}
	while(n!=0);
	return dec;
}
}
