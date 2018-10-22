import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++)
		{
		    int m = s.nextInt();
    	    int zeroCount = 0;
		    
		    // Every 5th factorial adds a 0, every 25th adds two, every 125th adds three, ...
		    for (int j = 5; m / j >= 1; j *= 5)
		    {
	            zeroCount += m / j;
		    }
		
    	    System.out.println(zeroCount);
		}
	}
}
