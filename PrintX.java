public class Main
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	int n=10;
	int i;
	for (i=0;i<n;i++)
	{
		int j;
	   for(j=0;j<n;j++)
	   {
	  
	   if(i==j ||i+j==n-1 )
	   System.out.print("*");
	   else
	    System.out.print(" "); 
	 }
	 System.out.println();
	
	}
	
	}
}
