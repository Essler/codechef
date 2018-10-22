import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		
		for (int t = 0; t < testCases; t++)
		{
		    int time = s.nextInt() - 1;
		    int pop = (int)(Math.pow(2, time / 16));
		    if (time % 16 >= 8)
		    {
		        System.out.printf("0 0 %d\n", pop);
		    }
		    else if (time % 16 >= 2)
		    {
		        System.out.printf("0 %d 0\n", pop);
		    }
		    else
		    {
		        System.out.printf("%d 0 0\n", pop);
		    }
		}
	}
}
