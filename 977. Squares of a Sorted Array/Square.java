import java.util.Arrays;
class Square
{
	public static void main(String [] arg)
	{
		int []  nums = {-4,-1,0,3,10};
		int [] res = sortedSquares(nums);
		System.out.println(Arrays.toString(res));
	}
	public static int[] sortedSquares(int[] nums) 
	{
		int res [] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
		{
			nums[i] = nums[i]*nums[i];
		}
		int head =0;
		int tail = nums.length-1;
		for(int i = nums.length-1;i>=0;i--)
		{
			if(nums[head]>nums[tail])
			{
				res[i] = nums[head];
				head++;
			}
			else
			{
				res[i] = nums[tail];
				tail--;
			}
		}
		return res;
    }
}