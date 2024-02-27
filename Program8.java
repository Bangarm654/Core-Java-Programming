// Swap two value without using Third variable ?

class Program8
{
	public static void main(String arg[])
	{
	int a=10;
	int b=20;
	System.out.println("a="+a+" b="+b);
	a+=b;                   //30
	b=a-b;                  //10
	a-=b;                   //20
	System.out.println("a="+a+" b="+b);
	}
}
