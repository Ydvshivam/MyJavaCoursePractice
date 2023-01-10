class A
{
	int i;
	public boolean equals(Object obj)
	{
		if(!(obj instanceof F))
		{
			return false;
		}

		F ref = (F)obj;
		boolean flag = (this.i == ref.i);
		return flag;
	}
}
class F
{
	int i;

	F(int i)
	{
		this.i = i;
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof A))
		{
			return false;
		}

		F ref = (A)obj;
		boolean flag = (this.i == ref.i);
		return flag;
	}
}
class M15
{

	public static void main(String[] args)
		{
			F f1 = new F(90);
			F f2 = new F(90);

			System.out.println(f1 == f2);
			System.out.println(f1.equals(f2));

			System.out.println(f1.i == f2.i);

			F f3 = f2;

			System.out.println(f3 == f2);
			System.out.println(f3.equals(f2));

			System.out.println(f3.i == f2.i);

			A a1 = new A();
			a1.i = 90;

			System.out.println(a1.i == f1.i);
			System.out.println(f1.equals(a1));
		}

}