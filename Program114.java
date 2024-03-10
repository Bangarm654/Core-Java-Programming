class Program114
{
	public static void main(String []args)
	{
		int n=5;
		int count=11;
		for(int i=n;i>=1;i--)
		{
			int c=count;
			for(int j=i;j>=1;j--) //5>=1
			{
				System.out.print(c+"\t");
				c++;
			}
			System.out.println();
			count-=i-1;
		}
	}
}

/*
11	12	13	14	15
7	8	9	10
4	5	6
2	3
1
*/
