package myPack;

public class Oops {

	public static void main(String[] args)
	{
		String str = "kkoo";
		CheckandSwapPalindrome ob = new CheckandSwapPalindrome();
		int swap = ob.countSwap(str);
		if(swap==0)
		{
			System.out.println("The String is a palindrome");
		}
		else if(swap!=-1 && swap!=0)
		{
			System.out.println("The Swaps required to make the string palindrome: "+swap);
		}
		else
			System.out.println("The String is not a palindrome and cannot be Swapped to make a palindrome");
	}
}