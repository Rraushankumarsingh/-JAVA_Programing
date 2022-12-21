import java.util.Scanner;
public class Sumofn 
{public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int x =sc.nextInt();
	int rs=sumofn(x);
	
}
static int sumofn(int x)
{
	
int s1=sumofn(x);
return x+sumofn(x);
	
}

}
