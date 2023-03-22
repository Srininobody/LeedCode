class leet239
{
	public static void main(String [] args)
	{
		int arr[] ={1,3,-1,-3,5,3,6,7};
		int key =3;
		int [] rs = rectangle(arr,key);
		System.out.println(rs);
		
	}
	public static int[] rectangle(int [] arr ,int key)
	{
		int start =0;
		int end = key;
		int count =0;
	
		for(int i=0;i<arr.length;i++)
		{
			int max= 0;
			if(i<=start && i<end)
			{
				System.out.println("out side"+i);
				if(max<arr[i])
				{
					System.out.println("inside  "+i);
					
					max =arr[i];
					System.out.println("max = "+max);
					count++;
					start++;
					end++;
				}
			}
		}
		
		System.out.println(count);
		int temp [] =new int[count];
		return temp;
	}
}