import java.util.Arrays;

class RemoveDuplicate
{
	public static void main(String args [])
	{
		int [] arr ={1,5,2,2,7,3,5,4,6};
		removes(arr);
	}
	public static int [] removes(int [] arr)
	{	
		
		int len = arr.length;
		boolean isDuplicate = false;
		int [] temp = new int[len];
		for(int i= 0;i<len ;i++)
		{
			for(int j = i+1; j<len ;j++)
			{
				if(arr[i] == arr[j])
				{
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate)
				System.out.print(arr[i] + " ");	
			isDuplicate = false;
		}
		// System.out.println(Arrays.toString(temp));
		
		return null;
	}
}