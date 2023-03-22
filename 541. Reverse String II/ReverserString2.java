class ReverserString2
{
	public static void main(String [] args)
	{
		String s = reverseStr("welcome",2);
		System.out.println(s);
	}
	public static String reverseStr(String s, int k) 
    {
		char [] arr = s.toCharArray();
		for(int i =0;i<arr.length;i=i+2*k)
		{
			int start = i;
			int end = ((i+k-1)<arr.length-1)?i+k-1:arr.length-1;
			while(start<end)
			{	
				char temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
				
			}
		}
		return String.valueOf(arr);
	}
	/*public String reverseStr(String s, int k) 
    {
        int p1 =0;
        int p2 = P1+k-1;
        char [] arr = s.toCharArray();

        while(p1<p2)
        {
            char temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
			
        }
        String res = "";
        for(int i =0;i<arr.length;i++)
        {
            res+=arr[i];
        }
        return res;   
    }*/
}