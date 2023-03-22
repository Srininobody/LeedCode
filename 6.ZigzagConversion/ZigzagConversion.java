import java.util.*;
class ZigzagConversion
{
	public static void main (String [] args)
	{	
		String s ="AB";
		int no =6;
		System.out.println(convert(s,no));
	}
	public static  String convert(String s, int numRows) 
    {
        String [] arr = new String [numRows];
		Arrays.fill(arr,"");
		int pos =0;
		int count =-1;
		int flag=0;
		while(pos<s.length())
		{
			if(flag==0&&count < numRows-1)
			{
				count++;
				arr[count] +=""+ s.charAt(pos);
				
				
				System.out.println(" 1=>"+count);
			}
			else 
			{
				--count;
			    arr[count] += ""+s.charAt(pos);
				
				System.out.println(" 2=>"+count);
				flag=count;
				
			}
			pos++;
		}
		String res = "";
		for(int i =0;i<arr.length;i++)
		{
		  res = res+arr[i];
		}
		return res;
    }
}