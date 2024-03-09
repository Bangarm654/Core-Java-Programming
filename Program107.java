class Program107
{
	public static void main(String[] args)
	{
		int n=5;
		int count=n;
		for(int i=n;i>=1;i--)
		{	
			int c =count;   //5
			for(int j=i;j<=n;j++) //5<=5
			{
				System.out.print(c+"\t");
				c-=j+1; //5-=5
			}
			System.out.println();
			count+=i-1;
		}
	}
}
/*
5
9	4
12	8	3
14	11	7	2
15	13	10	6	1
*/