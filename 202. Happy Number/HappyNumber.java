import java.util.*;
class HappyNumber
{
	public static void main(String [] args)
	{
		System.out.println(isHappy(19));
	}
	 public static  boolean isHappy(int n)
    {
        HashSet<Integer> hs = new HashSet<Integer>() ;
		while(true)
		{
			int sum =0;
			while(n>0)
			{
				int pow = n%10;
				sum = sum+(pow*pow);
				n=n/10;
			}
			if(sum==1)
			{
			return true;
			}
			n=sum;
			if(hs.contains(n))
			{
			return false;
			}
			hs.add(n);
		}
    }
}