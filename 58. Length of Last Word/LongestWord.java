class LongestWord
{
	public static void main(String [] args)
	{
		String s = "HelloWW WorldMM";
		int n = lengthOfLastWord(s);
		System.out.println(n);
		
	}
	public static  int lengthOfLastWord(String s)
	{
        int count= 0;
		boolean flag = false;
		int st =0;
		int e =0;
		for(int i =s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			{
				st= i;
				count++;
				flag = true;
			}
			else if(flag)
			{
				e=i;
			break;
			}
		}
		String s1 = s.substring(st);
		System.out.println(s1);
		return count;
    }
}