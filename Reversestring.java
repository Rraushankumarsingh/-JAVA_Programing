import java.util.Scanner;
public class Reversestring
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter anumber ");
		String  x=sc.nextLine();
		
		String rev="";
		for (int i=x.length()-1; i>=0;i--)
		{
			rev=rev+x.charAt(i);
		}
		System.out.println(rev);
	sc.close();
	}

}
