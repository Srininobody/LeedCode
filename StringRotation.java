class StringRotation
{
	public static void main(String [] args)
	{
		String s = rotation("abcdef",100);
		System.out.println(s);
	}
	public static String rotation(String s , int pos)
	{
		String temp ="";
		for(int i =0;i<pos%s.length();i++)
		{
			temp+=s.charAt(i);
		}
		String res ="";
		for(int i = pos%s.length();i<s.length();i++)
		{
			res+=s.charAt(i);
		}
		return res+temp;
	}
	
}