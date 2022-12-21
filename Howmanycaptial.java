import java.util.*;
public class Howmanycaptial
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("entre a string ");
	String str=sc.nextLine();
int count=0;
int count1=0;
for(int i=0;i<str.length();i++)
{
	char ch=str.charAt(i);
	if(ch>='A'&&ch<='Z')
		count++;
	if(ch>='a'&&ch<='z')
		count1++;
}
System.out.println("captial letter ar "+count);
System.out.println("smoll leater are "+count1);
sc.close();
}
}
