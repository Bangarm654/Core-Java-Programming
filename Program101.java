class Program101
{
	public static void main(String []args)
	{
		int n=5;
		int count=n*(n+1)/2;
		for(int i=1;i<=n;i++)
		{
			int c=count;
			for(int j=1;j<=i;j++)  //1<=1
			{
				System.out.print(c+"\t");
				c++;
			}
			System.out.println();
			count-=i+1;
		}
	}
}
/*
15
13	14
10	11	12
6	7	8	9
1	2	3	4	5
*/