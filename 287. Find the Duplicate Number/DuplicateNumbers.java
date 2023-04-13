import java.util.Arrays;
class DuplicateNumbers
{
	public static void main(String [] args)
	{
		int [] nums = {1,3,4,2,2};
		int res = findDuplicate2(nums);
		System.out.println(res);
	}
	public static  int findDuplicate(int[] nums) 
	{
	
        int slow =0;
		int fast =0;
		do
		{
			slow = nums[slow];
			fast = nums[nums[fast]];
		}
		while(slow!=fast);
		slow =0;
		while(slow!=fast)
		{
		slow = nums[slow];
		fast = nums[fast];
		}
		return slow;
    }
	public static  int findDuplicate2(int[] nums) 
	{
		Arrays.sort(nums);
		for(int i =0;i<nums.length-1;i++)
		{
			
			if(nums[i] == nums[i+1])
			{
				return nums[i];
			}
		}
		return -1;
	}
}