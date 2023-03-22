import java.util.Arrays;
class LongestCommonPrefix
{
	public static void main(String [] args)
	{
	
		String [] str = {"flower","flow","flight"};
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		System.out.println(longestCommonPrefix(str));
		
	}
	public static String longestCommonPrefix(String[] strs) 
	{
		   if (strs == null || strs.length == 0) 
		{
            return "";
        }
        if (strs.length == 1) 
		{
            return strs[0];
        }
        String res = "";
        int pos = 0;
        while (true) 
		{
            if (pos >= strs[0].length()) 
			{
                return res;
            }
            char c = strs[0].charAt(pos);
            for (int i = 1; i < strs.length; i++) 
			{
                if (pos >= strs[i].length() || strs[i].charAt(pos) != c) 
				{
                    return res;
                }
            }
            res += c;
            pos++;
        }
    }
}