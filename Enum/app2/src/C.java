class C
{
	enum D
	{
		CON(100), TEST(200);
		D(int i)
		{
			System.out.println("D(int): "+ i);
		}
	}
	public static void main(String[] args)
	{
		D d1 = D.TEST;
		System.out.println(d1);

	}
}