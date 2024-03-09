class Program106
{  
	public static void main(String[] args)
	{
		int n=5;
		int count = 1;
		for(int i=n;i>=1;i--) //4>=1
		{
			int c = count;  //6
			for(int j=i;j<=n;j++) //4<=5
			{
				System.out.print(c+"\t"); //1
				c-=j;
			}
			System.out.println();
			count+=i; 
		}
	}
}
/*
1
6	2
10	7	3
13	11	8	4
15	14	12	9	5	
*/