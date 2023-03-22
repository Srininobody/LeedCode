class BinaryAddtion
{
	public static void main(String  [] args)
	{
		String s1 ="111";
		String s2 ="111";
		System.out.println(addBinary(s1,s1));
	}
	public static  String addBinary(String a, String b) 
	{
		
		int carry = 0;
		int i = a.length() - 1;
		int j = b.length() - 1;
		String res ="";

		while (i >= 0 || j >= 0 || carry != 0) {
        int sum = carry;
        if (i >= 0) {
            sum =sum+ a.charAt(i) - '0';
            i--;
        }
        if (j >= 0) {
            sum =sum + b.charAt(j) - '0';
            j--;
        }
		res = res+sum%2;
        //result.append(sum % 2);
        carry = sum / 2;
    }
   
		System.out.println(res);
		String ans ="";
		for (int k=0; k<res.length(); k++)
		{
		char  ch= res.charAt(k); 
        ans= ch+ans; 
		}
       return ans; 
    }
	
	
}

 