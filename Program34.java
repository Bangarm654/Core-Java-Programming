/*
1
12
123
1234
12345
*/

class Program34
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=1;i<=n;i++) //2<=5
		{
			for(int j=1;j<=i;j++)    //2<=2
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}