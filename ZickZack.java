
public class ZickZack 
{
public static void main(String[] args) {
	int a[]= {10,20,30};
	int b[]= {40,50,60};
	int c[]=new int[a.length+b.length];
	System.out.println("size of an arrays"+c.length);
	int j=0;
	int k=0;
	while(j<a.length&&j<b.length)
	{
		c[k]=a[j];
		k++;
		c[k]=b[j];
		k++;
		j++;
	}
	while(j<a.length)
	{
		c[k]=a[j];
		k++;
		j++;
	}
	while(j<b.length)
	{
		c[k]=b[j];
		k++;
		j++;
	}
	System.out.println("arrays zickZack");
	for(int i=0;i<c.length;i++)
	{
		System.out.println(c[i]);
	}
}
}
