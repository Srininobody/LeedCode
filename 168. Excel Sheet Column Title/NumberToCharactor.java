class NumberToCharactor
{
	public static void main(String [] args)
	{
		String s = convertToTitle(28);
		System.out.println(s);
	}
	public static String convertToTitle(int columnNumber) 
    {
        String res = "";
		while(columnNumber>0)
		{
			int n = (columnNumber-1)%26;
			char ch = (char)(n+65);
			res = res+ch;
			columnNumber=(columnNumber-1)/26;
		}
		String send = "";
		for(int i =res.length()-1;i>=0;i--)
		{
			send = send+res.charAt(i);
		}
        return send;
    }
}