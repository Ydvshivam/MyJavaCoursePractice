import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;


@Retention(RetentionPolicy.RUNTIME)
@interface Y
{
	String message();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Z
{
	String message();
}

@Y(message = "abc")
@Z(message = "xyz")
class Manger
{
	public static void main(String[] args)
	{
		Class c1 = Class.forName("Manger");
		Annotation[] annotation = c1.getAnnotation();

		for(Annotation annotation : annotation)
		{
			System.out.println(annotation);
		}
	}
}

//3 retention policy 1. SOURCE 2.CLASS 3.RUNTIME99