class Program56
{
	public static void main(String [] args)
	{
		int n=5;
		for(int i=1;i<=n;i++)  //2<=5
		{
			for(int j=i;j>=1;j--) //1>=2
			{
				System.out.print((char)(j+96));
			}
			System.out.println();
		}
	}
}

/*
a
ba
cba
dcba
edcba
*/