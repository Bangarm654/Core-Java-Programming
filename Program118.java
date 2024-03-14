class Program118
{
	public static void main(String[] args)
	{
		int n=5;
		int count=11;
		for(int i=1;i<=n;i++)
		{
			int c=count;
			for(int j=n;j>=i;j--)
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
11 	7  	4  	1	1
12 	8	5   	3
13 	9	6
14	10	
15 
*/