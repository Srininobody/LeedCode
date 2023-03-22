class HouseRobber
{
	public static void main(String [] args)
	{
		int [] arr = {5,6,7,8};
		int res =rubber(arr);
		System.out.println(res);
	}
	public static int rubber(int [] num)
	{
		 int n =num.length;
		 if(n <=1)
		 {
			return num[0];
		 }
		 int temp[] = new int[n-1];
		 temp[0] = num[0];
		 temp[1] =(num[0]>num[1])?num[0]:num[1];
		 for(int i =2;i<num.length-1;i++)
		 {
			int val = temp[i-2]+num[i];
			temp[i] = (temp[i-1]>val)?temp[i-1]:val;
		 }
		 int temp2[] = new int  [n-1];
		 temp2[0]=num[1];
		 temp[1]=(num[1]>num[2])?num[1]:num[2];
		 for(int i =2;i<num.length-1;i++)
		 {
			int val2 = temp[i-2]+num[i+1];
			temp[i] = (temp[i-1]>val2)?temp[i-1]:val2;
		 }
		 
		return  (temp[n-2]>temp2[n-2])?temp[n-2]:temp2[n-2];
	}
}