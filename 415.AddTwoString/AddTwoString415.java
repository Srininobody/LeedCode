class AddTwoString415
{
	public static void main(String [] args)
	{
		String s1 = "999";
		String s2 = "999";
		System.out.println(addStrings(s1,s2));
	}
	 public static  String addStrings(String num1, String num2) 
    {
		String res ="";
		if(num1.length()==0 && num2.length()==0)
		{
			res = res+0;
		}
		int carry =0;
		int p1 = num1.length()-1;
		int p2 = num2.length()-1;
		while(p1>=0 || p2>=0  || carry>0)
		{
			if(p1>=0)
			{
				carry =carry+(int) ( num1.charAt(p1)-'0');
				p1--;
			}
			if(p2>=0)
			{
				carry =carry+(int) ( num2.charAt(p2)-'0');
				p2--;
			}
			res = res +carry%10;
			carry = carry/10;
			
		}
		String give ="";
		for(int i = res.length()-1;i>=0;i--)
		{
			give = give+res.charAt(i);
		}
		return give;
	}
}