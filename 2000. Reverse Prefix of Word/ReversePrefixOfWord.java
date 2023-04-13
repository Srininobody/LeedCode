class ReversePrefixOfWord
{
	public static void main(String [] args)
	{
		String str ="abcdefd";
		char ch ='t';
		System.out.println(reversePrefix(str,ch));
	}
	public  static String reversePrefix(String word, char ch) 
	{
		String str ="";
		boolean flag =false;
		int in =0;
		for(int i =0;i<word.length();i++)
		{
			if(word.charAt(i) == ch)
			{
				str = word.charAt(i)+str;
				flag = true;
				in = i;
				break;
			}
			else
			str = word.charAt(i)+str;
		}
		for(int i =in+1;i<word.length();i++)
		{
			str = str+word.charAt(i);
		}
		if(flag)
		{
			return str; 
		}
       return word;
    }
}