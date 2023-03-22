class AddDigit
{
	public static void main(String[] args)
	{
		int ans = addDigits(38);
		System.out.println(ans);
	}
	public static  int addDigits(int num) 
    {
		if(num<10)
		{
			return num;
		}
		int sum =0;
		while(num>0)
		{
			sum = sum+(num%10);
			num = num/10;
		}
		
		return addDigits(sum);
		 
    }
}