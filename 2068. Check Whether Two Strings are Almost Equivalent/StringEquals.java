class StringEquals
{
	public static void main(String [] args)
	{
		String w1 ="abcdeef";
		String w2 ="abaaacc";
		System.out.println(checkAlmostEquivalent(w1,w2));
	}
	 public static  boolean checkAlmostEquivalent(String word1, String word2) 
	{
        int [] feq = new int[26];
		for(int i =0;i<word1.length();i++)
		{
			feq[word1.charAt(i)-'a']++;
			feq[word2.charAt(i)-'a']--;
		}
		for(int i =0;i<feq.length;i++)
		{
			if(Math.abs(feq[i])>3)
			{
				return false;
			}
		}
		return true;
    }
}