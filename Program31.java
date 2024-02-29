/*
eeeee
ddddd
ccccc
bbbbb
aaaaa
*/
class Program31
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{	
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(102-i));
			}
			System.out.println();
		}
	}
}