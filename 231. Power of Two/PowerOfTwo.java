class PowerOfTwo
{
	public static void main(String [] args)
	{
		System.out.println(isPowerOfTwo(9));
	}
	public static  boolean isPowerOfTwo(int n) 
	{
		if(n==0)
		{
		return false;
		}
		while(n!=1)
		{
			if(n%2 !=0)
			{
				break;
			return false;
			}
			n=n/2;
		}
       return true; 
    }
}