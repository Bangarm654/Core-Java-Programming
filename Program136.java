class Program136
{
	public static void main(String []args)
	{
		int n =5;
		int count=n;
		for(int i=1;i<=n;i++)
		{
			int c=count;
			for(int j=i;j>1;j--)
			{
				System.out.print("\t");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print(c+"\t");
				c+=j-1;
			}
			System.out.println();
			count--;
		}
	}
}
/*
5	9	12	14	15
	4	8	11	13
		3	7	10
			2	6
				1
*/