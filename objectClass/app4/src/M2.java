class B
{
	protected void finalize()
	{
		System.out.println("from finalize");
	}
}
class M2
{
	public static void main(String[] args)
	{
		B b1 = new B();
		b1 = null;

		System.gc();
		//Runtime.getRuntime().gc();

		for(int i= 0; i<= 200; i++)
		{
			System.out.println(i);
		}

		System.out.println("program end");
	}
}