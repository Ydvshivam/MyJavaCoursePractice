import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;


@Retention(RetentionPolicy.RUNTIME)
//@Retention(RetentionPolicy.CLASS)
@interface Y
{
	String message();
}

@Retention(RetentionPolicy.RUNTIME)
//@Retention(RetentionPolicy.CLASS)
@interface Z
{
	String message();
}

@Y(message = "abc")
@Z(message = "xyz")
class M1
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("M1");
		Annotation[] annotation = c1.getAnnotation();

		for(Annotation annotation : annotation)
		{
			System.out.println(annotation);
		}
	}
}

//3 retention policy 1. SOURCE 2.CLASS 3.RUNTIME99