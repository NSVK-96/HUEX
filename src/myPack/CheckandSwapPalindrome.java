package myPack;

public class CheckandSwapPalindrome {
	static int countSwap(String str)
	{
		int n = str.length();
		char s[] = str.toCharArray();
		int count = 0;

		for (int i = 0; i < n / 2; i++) 
		{
			int left = i;
			int right = n - left - 1;

				while (left < right) 
				{
					if (s[left] == s[right]) {
						break;
					}
					else {
						right--;
					}
				}
			
			if (left == right) {
				return -1;
			}
			
			else if (s[left] != s[n - left - 1]) {
				char temp = s[right];
				s[right] = s[n - left - 1];
				s[n - left - 1] = temp;
				count++;
			}
		}
	return count;
	}
}