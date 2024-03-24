class Program135
{
	public static void main(String[] args)
	{
		int n=5;
		int count =1;
		for(int i=1;i<=n;i++)
		{
			int c=count;
			for(int j=1;j<i;j++)
			{
				System.out.print("\t");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print(c+"\t");
				c+=j;
			}
			System.out.println();
			count++;
		}
	}
}
/*
1	6	10	13	15
	2	7	11	14
		3	8	12
			4	9
				5
*/