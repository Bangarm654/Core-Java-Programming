class Program113
{
	public static void main(String args[])
	{
		int n=5;
		int count = n*(n+1)/2;
		for(int i=n;i>=1;i--)
		{
			int c=count;
			for(int j=i;j>=1;j--) //5>=1
			{
				System.out.print(c+"\t");
				c--;
			}
			System.out.println();
			count-=i;
		}
	}
}

/*
15	14	13	12	11
10	9	8	7
6	5	4
3	2
1
*/