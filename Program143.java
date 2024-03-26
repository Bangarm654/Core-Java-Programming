class Program143
{
	public static void main(String[] args)
	{
		int n=5;
		int count1=1;
		int count2=(n*(n+1))/2;
		for(int i=1;i<=n;i++)
		{
			int c1=count1;
			int c2=count2;
			for(int j=i;j>1;j--)
			{
				System.out.print("\t");
			}
			for(int j=n,j1=i;j>=i && j1<=n;j--,j1++)
			{
				System.out.print((char)(c1+64));
				System.out.print(((char)(c2+96))+"\t");
				c1+=j;
				c2-=j1+1;
			}
			System.out.println();
			count1++;
			count2-=i;
		}
	}
}
/*
Ao	Fm	Jj	Mf	Oa
	Bn	Gk	Kg	Nb
		Cl	Hh	Lc
			Di	Id
				Ee
*/
