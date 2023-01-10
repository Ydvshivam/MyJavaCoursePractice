class Test <X>
{

}
class Manager20
{
	static void test(Test <?>a1)
	{
	}

	public static void main(String[] args)
	{
		Test<? super Number> a1 = null;

		a1 = new Test<Number>();
		a1 = new Test<Object>();

		System.out.println("done");
	
	}
}