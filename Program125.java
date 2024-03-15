class Program125
{
	public static void main(String[] args)
	{
		int n=5;
		int count=n;
		for(int i=n;i>=1;i--) 
		{
			int c=count; 
			for(int j=i;j>1;j--) 
			{
				System.out.print("\t");
			}
			for(int j=i;j<=n;j++) 
			{
				System.out.print(c+"\t");//6
				c+=j+1; 
			}
			System.out.println();
			count--;
		}
	}
}
/*
				5
			4	9
		3	8	12
	2	7	11	14
1	6	10	13	15
*/
