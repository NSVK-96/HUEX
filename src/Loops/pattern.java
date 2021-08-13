package Loops;

public class pattern {

	public static void printPattern(int n)
	{
		int i, j;
		for (i=1; i<=n; i++)
		{
			for (j=1; j<=n; j++)
			{
				if (i==1 || i==n || j==1 ||
						j==n || i==j || j==(n-i+1))           
					System.out.print("*");           
				else          
					System.out.print(" ");           
			}
			System.out.println();
		}
	}

	public static void main(String args[])
	{
		int rows = 20;
		printPattern(rows);
	}
}
