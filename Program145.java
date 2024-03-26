class Program145
{
	public static void main(String[] args)
	{
		int n=5;
		int count1=1;
		int count2=n*(n+1)/2;
		for(int i=1;i<=n;i++)
		{
			int c1=count1;
			int c2=count2;
			for(int j=i;j>1;j--)
			{
				System.out.print("\t");
			}
			for(int j=i,j1=n;j1>=1 && j<=n;j++,j1--)
			{
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+96)+"\t");
				c1+=j;
				c2-=j1;
			}
			System.out.println();
			count1+=i+1;
			count2--;
		}
	}
}
/*
Ao	Bj	Df	Gc	Ka
	Cn	Ei	He	Lb
		Fm	Ih	Md
			Jl	Ng
				Ok
*/
