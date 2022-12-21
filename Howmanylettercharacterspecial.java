import java.util.Scanner;
public class Howmanylettercharacterspecial 
{
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int letter=0;
	int spl=0;
	//int digit=0;
	//int space=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
			letter++;
		else if(ch!='0'&&ch!='9'||ch!=' ')
		     spl++;
	}
	System.out.println(" letter are "+letter);
	//System.out.println("digit chateer  are "+digit);
	//System.out.println("space chateer  are "+space);
	System.out.println("spical chateer  are "+spl);
}
}
