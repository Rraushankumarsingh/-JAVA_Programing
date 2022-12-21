import java.util.Scanner;
public class HowmanyVowels 
{
	public static void main(String[] args) 
{
 Scanner sc=new Scanner(System.in);
   System.out.println("enter a string");
   String st=sc.nextLine();
   int count=0;
   for (int i= 0;i<=st.length();i++) 
   {
	   
	char ch=st.charAt(i);
	if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U');
	count++;
   }
  
   System.out.println(count);
	sc.close();
	}
}

