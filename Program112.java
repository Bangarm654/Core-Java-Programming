class Program112
{
	public static void main(String []args)
	{
		int n=5;
		int count=1;
		for(int i=n;i>=1;i--)
		{
			int c=count; //2
			for(int j=i;j>=1;j--)
			{
				System.out.print(c+"\t");
				c+=1;
			}
			System.out.println();
			count+=i;
		}
	}
}
/*
1	2	3	4	5
6	7	8	9
10	11	12
13	14
15
*/