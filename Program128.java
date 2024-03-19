class Program128
{
	public static void main(String[] args)
	{
		int n=5;
		int count=n*(n+1)/2;
		for(int i=n;i>=1;i--) 
		{
			int c=count;
			for(int j=i;j>1;j--)
			{
				System.out.print("\t");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(c+"\t");
				c+=j;
			}
			System.out.println();
			count-=i;
		}
	}
}
/*
				15
			10	14
		6	9	13
	3	5	8	12
1	2	4	7	11
*/
