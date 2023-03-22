class CommanPrefix
{
	public static void main(String [] args)
	{
		String [] arr ={"dg","dacecar","dar"};
		String res = longestCommonPrefix(arr);
		System.out.println(res);
	}
	public static  String longestCommonPrefix(String[] strs) 
	{
		String str = "";
		char ch;
		int cnt = 0;

		if (strs.length == 1) 
		{

		  return strs[0];

		}
		for (int j = 0; j < strs[0].length(); j++) 
		{

		  ch = strs[0].charAt(j);
		  for (int i = 1; i < strs.length; i++) 
		  {
			if (j < strs[i].length()) 
			{

			  if (strs[i].charAt(j) == (ch))
			  {
				cnt++;
			  }
			  else
			  {
				return str;
			  }

			  if (cnt == strs.length - 1) 
			  {
				str = str + ch;
				cnt = 0;
			  }

			} 
			else
			{
				return str;
			}
			  

			  }
			  cnt = 0;
			}

		return str;
	}
	
	public static  String longestCommonPrefix2(String[] strs)
	{
		String prefix = strs[0];
		if(strs.length ==0)
		{
			return " ";
		}
		
		
		for(int i=1 ; i<strs.length ;i++)
		{
			while(strs[i].indexOf(prefix) !=0)
			{
				prefix = prefix.substring(0,prefix.length()-1);
			}
		}
		return prefix;
	}	
}