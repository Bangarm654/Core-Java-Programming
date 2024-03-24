class Program132
{
	public static void main(String[] args)
	{
		int n=5;
		int count=15;
		for(int i=1;i<=n;i++)  //2<=5
		{
			for(int j=i;j>1;j--) //2>1
			{
				System.out.print("\t");
			}
			for(int j=i;j<=n;j++) //1<=5
			{
				System.out.print(count+"\t");
				count--;
			}
			System.out.println();
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