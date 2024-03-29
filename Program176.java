class Program176
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				if(j%2!=0)
					System.out.print((char)(j+64));
				else
					System.out.print((char)(j+96));
			}
			System.out.println();
		}
	}
}
/*
EdCbA
 EdCb
  EdC
   Ed
    E
*/