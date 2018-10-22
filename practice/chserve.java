import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		
		for (int t = 0; t < testCases; t++)
		{
		    int chefPoints = s.nextInt();
		    int cookPoints = s.nextInt();
		    
		    int pointSwitch = s.nextInt();
		    
		    if ((chefPoints + cookPoints) / pointSwitch % 2 == 0)
		    {
		        System.out.println("CHEF");
		    }
		    else
		    {
		        System.out.println("COOK");
		    }
		}
	}
}
