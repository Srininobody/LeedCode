class CharactorToNumber
{
	public static void main(String [] args)
	{
		int  s = titleToNumber("SRINI");
		System.out.println(s);
	}
	 public static int titleToNumber(String columnTitle) 
    {
        int res =0;
        for(int i =0;i<columnTitle.length();i++)
        {
            res = res*26+(columnTitle.charAt(i)-'A'+1);
        }
        return res;
    }
}