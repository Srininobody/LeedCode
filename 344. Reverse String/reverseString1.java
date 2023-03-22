import java.util.Arrays;
class reverseString1
{
	public static void main(String [] args)
	{
		char [] arr ={'h','e','l','l','o'};
		reverseString(arr);
	}
	public static  void reverseString(char[] s) 
    {
        int p1 =0;
        int p2 = s.length-1;
        while(p1<p2)
        {
            char temp = s[p1];
            s[p1] = s[p2];
            s[p2] = temp;
            p1++;
            p2--;
        }
		System.out.println(Arrays.toString(s));
        
    }
}