//program to print all the methods inside Object class
import java.lang.reflect.Method;
class M2
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		int count = 0;
		Class c1 = Class.forName("java.lang.Object");

		Method[] m = c1.getDeclaredMethods();
		
		for(Method m1 : m)
		{
			count++;
			System.out.println(m1.getName());
		}

	}
}