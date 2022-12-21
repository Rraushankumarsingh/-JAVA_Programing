import java.util.*;
public class Replese 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String st=sc.nextLine();
	String str=st.replaceAll("[^a-zA-Z0-9\\s]", " ");
	System.out.println(st.length()-str.length());
	sc.close();
}
}
