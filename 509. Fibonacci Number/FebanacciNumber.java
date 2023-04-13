class FebanacciNumber
{
	public static void main(String [] args)
	{
		int res = feb(3);
		System.out.println(res);
		int res2 = fib2(3);
		System.out.println(res2);
		System.out.println(fib3(3));
	}
	public static int feb(int n)
	{
		if(n<=1)
		{
			return n;
		}
		int a=0;
		int b =1;
		int c=0;
		n =n-1;
		
		while(n>0)
		{
			c= a+b;
			
			a=b;
			b=c;
			n--;
		}
		return c;
	}
	
	public static int fib2(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
	public static int fib3(int n)
	{
		if(n<=1) return n;
		return fib3(n-2)+fib3(n-1);
	}

}