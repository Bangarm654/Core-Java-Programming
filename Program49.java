class Program49
{
	public static void main(String []args)
	{
		int n=5;
		for(int i=n;i>=1;i--) //4>=5
		{
			for(int j=i;j<=n;j++) //1>=5
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

/*
5
44
333
2222
11111
*/