class Program40
{
	public static void main(String [] args)
	{
		int n=5;
		for(int i=1;i<=n;i++)  //5<=5
		{
			for(int j=n;j>i;j--) //5>5
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)  //1>=1
			{
				System.out.print(*");
			}
			System.out.println();
		}
	}
}

/*
    *
   **
  ***
 ****
*****
*/