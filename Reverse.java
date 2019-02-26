class Reverse
{
	public static void main(String[] args)
	{
		int number=141;
		int mod,reverse=0;
		int palindrome=number;
		while(number>0)
		{
			mod=number%10;
			reverse=reverse*10+mod;
			number=number/10;
		}
		System.out.println("The Reversed number is "+reverse);
		if(palindrome==reverse)
		{
			System.out.println("The given number is palindrome");
		}
	}
}
