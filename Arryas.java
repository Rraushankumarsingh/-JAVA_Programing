//import java.util.Scanner;
//find the largest name length
public class Arryas 
{
  public static void main(String[] args) 
  {
	//Scanner sc=new Scanner(System.in);
	  String st[]= {"raju","raushan","rupani","poonimea","pinkiea"};
	  String big=st[0];
	  for(int i=1;i<st.length;i++)
	  {
		  if(st[i].length()>big.length()) 
		  
			  big=st[i];
	  
		 
	  }
	  System.out.println(big);
	  System.out.println(big.length());
} 
  }
