import java.lang.reflect.Method;
class E
{
	public static void main(String[] args) throws Exception
	{
		int count = 0;
		Class c1 = Class.forName("Java.lang.String");
		 
		Method[] methods = c1.getMethods();

		for(Method method : methods)
		{
			count++;
				System.out.println(method);
		}

		System.out.println("Total number of methods: " + count);
	}
}

