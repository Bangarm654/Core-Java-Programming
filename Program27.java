/*
EEEEE
DDDDD
CCCCC
BBBBB
AAAAA
*/
class Program27
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++)  //5>=1
			{
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
	}
}