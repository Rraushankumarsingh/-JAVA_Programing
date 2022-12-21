import java.util.Scanner;
public class smoll 
{
public static void main(String[] args) 
{System.out.println("enter a string");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int smoll=0;
	int dig=0;
	int spl=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>='a'&&ch<='z')//||)
		
			smoll++;
		else if(ch>='0'&&ch<='9')
			dig++;
		else if(ch!='A'&&ch!='Z')
			if(ch!=' ')
			spl++;
			
			
	}
	System.out.println(smoll);
	System.out.println(dig);
	System.out.println(spl);
}
}
