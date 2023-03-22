//input
//arr1 =[2,4,3]
//arr2 =[5,6,4]

//output =[7,0,8]
import java.util.Scanner;



class TwoArrayNumber
{
	public static void main(String [] srini)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Array");
		String s1 = sc.next();
		System.out.println("Enter the Second Array");
		String s2 = sc.next();
		int arr1 [] = new int[s1.length()-(s1.length()/2)];
		int arr2 [] = new int[s2.length()-(s2.length()/2)];
		
		for(int i =0;i<s1.length();i++)
		{
			if(s1.charAt(i) !=',')
			{
				int n = (int)s1.charAt(i)-'0';
				System.out.println(n);
			}
		}
	}
}