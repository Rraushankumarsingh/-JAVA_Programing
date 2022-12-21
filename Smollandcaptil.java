import java.util.Scanner;
public class Smollandcaptil 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String str=sc.nextLine();
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>='A'&&ch[i]<='Z')
		{
			ch[i]=(char)(ch[i]+38);
		}
		
		String st=new String(ch);
		System.out.println(st);
		sc.close();
}
}
}
