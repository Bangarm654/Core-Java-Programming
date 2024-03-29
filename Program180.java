class Program180
{
	public static void main(String[] args)
	{
		int n=10;
		for(int i=1;i<=n;i++) //1<=5
		{
			for(int j=1;j<=i;j++) //1<=1
			{
				if(j%2!=0)  //1%2!=0
					System.out.print((char)((j/2)+1+64));
				else                         //1/2+1+64
					System.out.print(j/2);
			}
			System.out.println();
		}


	}	
}
/*
A
A1
A1B
A1B2
A1B2C
*/
