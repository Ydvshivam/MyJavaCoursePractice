class C
{
	int i;//we can only written int value and you cant do double, float but char maigt be posiible
	
	C(int i)
	{
		this.i = i;
	}

	public int hashCode()
	{
		return i;
	}
}
class M3
{
	public static void main(String[] args)
	{
		C c1 = new C(90);
		C c2 = new C(90);

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
}