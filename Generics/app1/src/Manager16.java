class Test <X>
{
}
class Manager16
{
	public static void main(String[] args)
	{
		Test<?> t1 = null;
		t1 = new Test<Integer>();
		t1 = new Test<Object>();
		t1 = new Test<String>();
		t1 = new Test<P>();
		t1 = new Test<Thread>();
	
		System.out.println("done");

	}
}