class Program54
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<=n;j++) //5<=5
			{
				System.out.print((char)(i+96));
			}
			System.out.println();
		}
	}
}

/*
e
dd
ccc
bbbb
aaaaa
*/