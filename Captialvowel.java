import java.util.Scanner;
public class Captialvowel 
{
public static void main(String[] args) {
	System.out.println("enter a string");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int vowel=0;
	int con=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')//||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			vowel++;
		else if(ch>='a'&&ch<='z')
		
			
		
			con++;
		
	}
	System.out.println("capital letter are "+vowel);
	System.out.println("concenent letter are "+con);
}
}
