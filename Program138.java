class Program138
{
	public static void main(String [] args)
	{
		int n=5;
		int count = (n*(n-1)/2)+1;
		for(int i=1;i<=n;i++)
		{
			int c=count;
			for(int j=i;j>1;j--)
			{
				System.out.print("\t");
			}
			for(int j=n;j>=i;j--) //5>1
			{
				System.out.print(c+"\t");
				c-=j-1;
			}
			System.out.println();
			count++;
		}
	}
}

/*
11	7	4	2	1
	12	8	5	3
		13	9	6
			14	10
				15
*/
