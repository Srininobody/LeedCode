import java.util.Arrays;
class AddTwoNumber
{
	public static void main(String [] args)
	{
		int [] arr1 ={9,9,9,9,9};
		int [] arr2 ={9,9,9,9};
		System.out.println(Arrays.toString(addNum(arr1,arr2)));
	}
	public static int [] addNum(int [] arr1,int [] arr2)
	{
		int len = (arr1.length>arr2.length)?arr1.length:arr2.length;
		int temp [] = new int[len];
		for(int i=0;i<len ;i++)
		{
			int res = arr1[i]+arr2[i];
			int rem = res%10;
			System.out.println("Rem "+rem);
			int cos = res/10;
			System.out.println("cos "+cos);
			if(cos>0)
			{
				//temp[i]= (rem+cos);
				arr1[i+cos]++;
			}
			temp[i] =rem;
		}
		return temp;
	}
}