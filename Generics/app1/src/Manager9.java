class I <X>
{
	X x1;
}
class Manager9
{
	public static void main(String[] args)
	{
	I<Integer> obj1 = new I<Integer>();
	I<String> obj2 = new I<String>();
	obj1.x1 = 20;
	obj2.x1 = "abc";
	System.out.println(obj1.x1);
	System.out.println(obj2.x1);
	}
}