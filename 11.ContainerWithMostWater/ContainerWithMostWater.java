class ContainerWithMostWater
{
	public static void main(String [] args)
	{
		int arr []  ={1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(arr));
	}
	public static int maxArea(int[] height) 
	{
        int left =0;
		int right = height.length-1;
		int max =-1;
		while(left<right)
		{	
			int len = right - left;
			int lowValue = (height[left]>height[right])?height[right]:height[left];
			int size = lowValue*len;
			if(size>max)
			{
				max = size;
			}
			if(left == right-1)
			{
				left =0;
				right--;
			}
			left++;
		}
		return max;
    }
}