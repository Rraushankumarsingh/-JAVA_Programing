import java.util.Scanner;
public class lowercase 
{
public static void main(String[] args) 
{System.out.println("enter a string");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			str.toLowerCase();
		else
			str.toUpperCase();
		System.out.println(ch);
	}
}
}
