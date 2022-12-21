import java.util.Scanner;
public class Binarytodecimal
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int rs=bintodec(n);
		System.out.println(rs);
		sc.close();
		
	}

       static int bintodec(int n)
       {
		int dec=0;
		int pw=1;
		do {
			int d=n%10;
			dec=dec+d*pw;
			pw=pw*2;
			n=n/10;
		}while(n!=0);
		return dec;
	}

}
