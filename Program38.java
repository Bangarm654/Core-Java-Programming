class Program38
{
	public static void main(String []args)
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;i<=n;i++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

/*
12345
1234
123
12
1
*/