class Program119
{
	public static void main(String[] args)
	{
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++)  //1<=5
		{
			int c=count;
			for(int j=i;j<n;j++)  //1<=5
			{
				System.out.print("\t");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(count+"\t");
				count++;
			}
			System.out.println();
			
		}
	}
}
/*
				1
			2	3
		4	5	6
	7	8	9	10
11	12	13	14	15
*/