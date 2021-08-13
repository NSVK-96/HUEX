package Loops;

public class frequencyOfDigits {
	public static void main(String[] args)
	{

		int a = 112290666;
		int[] digitCount = new int[10];

		while (a != 0)
		{
			int lastDigit = a % 10;
			digitCount[lastDigit]++;
			a=a/10;
		}

		for (int i=0; i<digitCount.length; i++)
		{
			if(digitCount[i] != 0)
			{
				System.out.println(i+" occured "+digitCount[i]+" time(s)");
			}
		}
	} 
}