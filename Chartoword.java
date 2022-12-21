package programing;
//import java.util.Scanner;
public class Chartoword 
{
public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	//System.out.println("enter a number");
	//int n=sc.nextInt();
	for(int i='a';i<='z';i++)
	{
		char rs=(char)i;
		char ra=(char)(i-32);
		System.out.println(rs+" ="+ i+" "+ra+"="+(i-32));
		
	}
	System.out.println();
}
}
