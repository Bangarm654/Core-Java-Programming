class Program178
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{	
			for(int j=i;j<n;j++) //5<1
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				//System.out.print((char)(j+((j%2!=0)?64:96)));
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
AbCdE
 AbCd
  AbC
   Ab
    A
*/
