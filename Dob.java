//import java.sql.Date;
import java.util.Scanner;
public class Dob 
{
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("inter a first date");
	int d1=sc.nextInt();
	int m1=sc.nextInt();
	int y1=sc.nextInt();
	Date dt1=new Date(d1,m1,y1);
	System.out.println("enter the second datedd ,mm,yy");
	int d2=sc.nextInt();
	int m2=sc.nextInt();
	int y2=sc.nextInt();
	
	Date dt2=new Date(d2,m2,y2);
    System.out.println("first date :"+dt1.toString());
	System.out.println("second date :"+dt2);
	
	System.out.println("number of date between these two date");
	System.out.println(dt2.noofDays() - dt1.noofDays());
	
	System.out.println(dt1 +"day name:" + dt1.getdayname());
	System.out.println(dt2 +"day name:" + dt2.getdayname());
}
}
