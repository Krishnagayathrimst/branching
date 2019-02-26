class Reverse
{
	public static void main(String[] args)
	{
		int number=299;
		int mod,reverse=0;
		while(number>0)
		{
			mod=number%10;
			reverse=reverse*10+mod;
			number=number/10;
		}
		System.out.println("The Reversed number is "+reverse);
	}
}