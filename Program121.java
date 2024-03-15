class Program121
{
	public static void main(String[] args)
	{
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			int c=count;
			for(int j=i;j<n;j++)
			{
				System.out.print("\t");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(c+"\t");
				c--;
			}
			System.out.println();
			count+=i+1;
		}
		
	}
}
/*
				1
			3	2
		6	5	4
	10	9	8	7
15	14	13	12	11
*/