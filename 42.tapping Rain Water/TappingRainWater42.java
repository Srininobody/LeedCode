import java.util.Arrays;
class TappingRainWater42
{
	public static void main(String [] args)
	{
		int [] arr ={0,1,0,2,1,0,1,3,2,1,2,1};
		
		System.out.println(tappingWater(arr));
	}
	public static int tappingWater(int [] arr)
	{
		int res =0;
		int n = arr.length;
		int maxLeft []  = new int [n];
		int maxRight []  = new int [n];
		int maxVal =arr[0];
		for(int  i =1;i<arr.length;i++)
		{
			maxLeft[0]=0;
			maxRight[n-1]=0;
			
			if(arr[i-1]>arr[i] )
			{
				if(maxVal< arr[i-1])
				{
					maxVal = arr[i-1];	
					maxLeft[i]= maxVal;
				}
				else{	
				maxLeft[i]= maxVal;
				}
			}
			else
			{
				maxLeft[i]= maxVal;
			}
			
		}
		int maxval2 =arr[n-1];
		for(int  i =arr.length-2;i>=1;i--)
		{
			//maxLeft[0]=0;
			maxRight[n-1]=0;
			
			if(arr[i]<arr[i+1] )
			{
				if(maxval2< arr[i+1])
				{
					maxval2 = arr[i+1];	
					maxRight[i]= maxval2;
				}
				else{	
				maxRight[i]= maxval2;
				}
			}
			else
			{
				maxRight[i]= maxval2;
			}
			
		}
		//System.out.println(Arrays.toString(maxLeft));
		//System.out.println(Arrays.toString(maxRight));
		int []  minarray = new int[n];
		for(int i =0;i<arr.length;i++)
		{
			if(maxLeft[i]<maxRight[i])
			{
				minarray[i]=maxLeft[i];
			}
			else
			{
				minarray[i]=maxRight[i];
			}
		}
		
		for(int i =0;i<arr.length;i++)
		{
			int val = minarray[i]-arr[i];
			if(val>0)
			{
				res=res+val;
			}
		}
		//System.out.println(Arrays.toString(minarray));
		
		return res;
	}
}