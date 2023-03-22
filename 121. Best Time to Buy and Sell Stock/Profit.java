import java.util.Arrays;
class Profit
{
	public static void main(String [] args)
	{
		int [] arr ={7,1,5,3,6,4};
		int res = maxProfit(arr);
		System.out.println(res);
		
	}
	public static int maxProfit(int[] prices) 
	{
		int n = prices.length;
		int left []  = new int[n];
		int right[] = new int[n];
		
		left[0]= prices[0];
		right[n-1]= prices[n-1];
		for(int i =1;i<n;i++)
		{
			if(prices[i]<prices[i-1] && left[i-1]>prices[i])
			{
				left[i]=prices[i];
			}
			else
			{
				left[i]=left[i-1];
			}
		}
		for(int i =n-2; i>=0;i--)
		{
			if(prices[i]>prices[i+1] && right[i+1]< prices[i] )
			{
				right[i] = prices[i];
			}
			else
			{
			right[i] = right[i+1];	
			}
		}
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
		int max =0;
		for(int i =0;i<n;i++)
		{
			left[i]= right[i]-left[i];
		}
		for(int i =0;i<left.length;i++)
		{
			if(max<left[i])
			{
				max= left[i];
			}
		}
		return max;
        
    }
}