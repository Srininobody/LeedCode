class TwoNum
{
	public static void main(String [] args)
	{
		int [] num = {2,7,11,15};
		int target =9;
		
		int[] ans = twoNum(num,target);
		System.out.println(ans[0] + " " + ans[1]);
	}
	public static int[] twoNum(int[] num, int target)
	{
		for(int i =0 ;i< num.length;i++)
		{
			for(int j=i+1 ; j<num.length ; j++)
			{
				if(num[i]+num[j]==target)
				{
					//System.out.println(i+","+j);
					return new int[] {i, j};
				}			
			}
		}
		
		return new int[]{-1, -1};
	}
}