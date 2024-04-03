class Program285
{
	public static void main(String []args)
	{
		int n=11;
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=n;j++)
			System.out.print(i==(n+1)/2||j==(n+1)/2||i>=n/2&&j>=n||i==1&&j>=n/2||i==n&&j<=n/2||j==1&&i<=n/2?"*":" ");
		System.out.println();

		}
	}
}
/*
   j
i  *
   *
   *  
*******
   *  
   *  
   *  
i==(n+1)/2||j==(n+1)/2
   ****
   *
   *  
*******
   *  
   *  
   *  
i>=n/2&&j>=n
   ****
   *
   *  
*******
   *  *
   *  *
   *  *
i==1&&j>=n/2
   ****
   *
   *  
*******
   *  *
   *  *
****  *

i==n&&j<=n/2
*  ****
*  *
*  *  
*******
   *  *
   *  *
****  *
j==1&&i>=n/2
*/