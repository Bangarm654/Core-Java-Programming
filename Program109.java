class Program109
{
	public static void main(String[] args)
	{
		int n=5;	
		int count = (n*(n-1)/2)+1;
		for(int i=n;i>=1;i--)         //5>=1
		{
			int c=count;          //
			for(int j=i;j<=n;j++) //5<=5
			{
				System.out.print(c+"\t");
				c+=j+1;       //12
			}
			System.out.println();
			count-=i-1;             //11-4
		}
	}
}
/*
11
7	12
4	8	13
2	5	9	14
1	3	6	10	15
*/