import java.lang.reflect.Field;
import java.lang.reflect.Method;

class A
{
	int i;
	void test1()
	{
		System.out.println("from test");
	}
}
class M8 
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("A");
		Object obj = c1.newInstance();
		Field f1 = c1.getDeclaredField("i");
		f1.setInt(obj, 20);
		Method m1 = c1.getDeclaredMethod("test1");
		m1.invoke(obj);
		System.out.println(f1.getInt(obj));
		System.out.println(obj);

	}
}
/* there is three way to creat object in java
1.new operatr
2.clonemethod
3.instance