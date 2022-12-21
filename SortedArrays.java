
public class SortedArrays 
{
	public static void main(String[] args) {
    int a[]= {10,17,25,45};
    int b[]= {11,22,33};
    int c[]=new int[a.length+b.length];
    int i=0;
    int j=0;
    int k=0;
    while(i<a.length&&j<b.length)
    {
    	if(a[i]<b[i])
    	{
    		c[k]=a[i];
    		i++;
    	}
    	else
    	{
    		c[k]=b[j];
    		j++;
    	}
    	k++;
    }
    while(i<a.length)
    {
    	c[k]=a[i];
    	k++;
    	i++;
    			
    }
    while(i<b.length)
    {
        c[k]=b[j];
        k++;
        j++;
    }
    System.out.println("sorted arrays");
    for(int m=0;m<c.length;m++)
    {
    	System.out.println(c[m]);
    }
}
}