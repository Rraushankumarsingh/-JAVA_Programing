import java.util.Scanner;
public class captial 
{
public static void main(String[] args) {
	System.out.println("enter a string");
	Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int captilv=0;
int smollc=0;
//int spl=0;
for(int i=0;i<str.length();i++)
{
	char ch=str.charAt(i);
	if(ch>='A'&&ch<='Z') 
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			captilv++;
	
	else if(ch>='a'&&ch<='z')
	
		if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u')
			smollc++;
	
System.out.println(captilv);
System.out.println(smollc);
}
}
}
