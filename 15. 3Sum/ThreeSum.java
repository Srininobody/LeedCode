import java.util.*;
class ThreeSum
{
	public static void main(String [] args)
	{
		int[] arr = {-1,0,1,2,-1,-4};
		Arrays.sort(arr);
		Set <List<Integer>> res = new HashSet<List<Integer>>();
		for(int i =0;i<arr.length-2;i++)
		{
			for(int j =i+1;j<arr.length-1;j++)
			{
				for(int k =j+1;k<arr.length;k++)
				{
					int sum = arr[i]+arr[j]+arr[k];
					if(sum ==0)
					{
						List<Integer> list = new ArrayList<Integer>();
						list.add(arr[i]);
						list.add(arr[j]);
						list.add(arr[k]);
						res.add(list);
					}
					
				}
			}
		}
		System.out.println(res);
	}
}