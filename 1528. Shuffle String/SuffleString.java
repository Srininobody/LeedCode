class SuffleString
{
	public static void main(String [] args)
	{
	String s ="codeleet";
	int [] arr = {4,5,6,7,0,2,1,3};
		String ans = restoreString(s,arr);
		System.out.println(ans);
	}
	 public static String restoreString(String s, int[] indices) 
	{
	
		char [] res = new char[s.length()];
		for(int i =0;i<res.length;i++)
		{
			res[indices[i]] = s.charAt(i);
		}
		return String.valueOf(res);
    }
}