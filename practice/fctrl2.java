import java.util.Scanner;
import java.math.BigInteger;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++)
		{
		    BigInteger m = BigInteger.valueOf(s.nextInt());
		    System.out.println(factorial(m));
		}
	}
	
	private static BigInteger factorial(BigInteger m)
	{
	    if (m.equals(BigInteger.valueOf(1)))
	    {
	        return m;
	    }
	    else
	    {
	        return m.multiply(factorial(m.subtract(BigInteger.valueOf(1))));
	    }
	}
}
