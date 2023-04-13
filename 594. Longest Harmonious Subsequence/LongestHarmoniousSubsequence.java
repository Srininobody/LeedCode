import java.util.Arrays;
class LongestHarmoniousSubsequence
{
	public static void main(String [] args)
	{
		int p[] ={1,3,2,2,5,2,3,7};
		System.out.println(findLHS(p));
	}
	public static int findLHS(int[] nums) 
	{
       Arrays.sort(nums); 
	   int left =0;
	   int right =1;
	   int result =0;
	   while(right<nums.length)
	   {
			int diff = nums[right]-nums[left];
			if(diff ==1)
			{
				result=  Math.max(result,right-left+1);
			}
			if(diff<=1)
			{
				right++;
			}
			else
			{
				left++;
			}
	   }
	   return result;
    }
}