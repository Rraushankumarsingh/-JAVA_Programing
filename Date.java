
public class Date 
{
  int dd;
  int mm;
  int yy;
  int month[]= {0,31,28,31,30,31,30,31,31,31,30,31,30,31};
  String Days[]= {"sunday","monday","tuesday","wednesday","thusday","friday","satatday"};
  Date(int dd ,int mm,int yy)
  {
	  this.dd=dd;
	  this.mm=mm;
	  this.yy=yy;
	  if(yy%4==0&&yy%100!=0||yy%400==0)
		  month[2]=29;
  }
  public String toString()
  {
	  return dd+"/"+mm+"/"+yy;
  }
  public int noofDays()
  {
	  int y=yy-1;
	  int days=y*365+y/4-y/100+y/400;
	  for(int i=0;i< mm;i++)
	  {
		  days=days+month[i];
	  }
	 days=days+dd;
	 return days;
  }
  public String getdayname()
  {
    
	return Days[noofDays()%7];
  }
}
