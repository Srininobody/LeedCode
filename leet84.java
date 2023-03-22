class leet84
{
	public static void main(String [] args)
	{
		int arr[] ={1};
		int rs = rectangle(arr);
		System.out.println(rs);
		
	}
	public static int rectangle(int [] height)
	{
		
		int len = height.length;
		if(len ==1)
		{
			for(int j=0;j<len;j++) return height[j];
				
		}
		int fmax = 0;
		int smax = 0;
		for(int i=0;i<len;i++)
		{
			if(fmax<height[i])
			{
				smax = fmax;
				fmax = height[i];
			}
		}
		System.out.println(fmax);
		System.out.println(smax);
		int r1 =smax+fmax;
		int r2 =smax-fmax;
		int res = r1 +r2;
		
		return res;
	}
}