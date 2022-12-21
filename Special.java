import java.util.Scanner;
public class Special
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	String str=sc.nextLine();
	int count=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(!(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'||ch>='0'&&ch<='9'))
			if(ch!=' ')
			count++;
	}
	System.out.println(count);
	sc.close();
}
}
