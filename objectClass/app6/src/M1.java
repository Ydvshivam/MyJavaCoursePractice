//Reflection API

class A
{
	int param1;
	String firstName;
}
class M1
{
	public static void main(String[] args)
	{
		A a1 = new A();
		//Return the class object that representn the runtime 

		Class c1 = a1.getClass();
		System.out.println(c1.getName());
	}
}