class A 
{
	int i;
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
		//F ref = (F)obj;
		boolean flag = (this.i == ref.i);
		return flag;
	}
}
class M14
{
	public static void main(String[] args)
	{
		F f1 = new F(90);
		F f2 = new F(90);

		A a1 = new A();
		a1.i = 90;

		System.out.println(f1.equals(f2));

		System.out.println(f1.equals(a1));

	}
}