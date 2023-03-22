import java.util.Arrays;

class PlusOne66
{
	public static void main(String [] args)
	{
		int [] arr =  {9,9,9};
		
		System.out.println(Arrays.toString(plusOne1(arr)));
	}
	public static int[] plusOne1(int[] digits) 
    {
			int n = digits.length;
			for(int i = n-1;i>=0;i--)
			{
				if(digits[i]<9)
				{
					digits[i]++;
					return digits;
				}
				digits[i]=0;
			}
			int [] newArray = new int [n+1];
			newArray[0]=1;
			return newArray;
	}
       
}