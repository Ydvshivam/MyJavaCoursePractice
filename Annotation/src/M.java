@interface L
{
int version() default 1;
String author();
}
@L(author = "abc")
class M
{
	@L( author = "xyz", version = 3)
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
//maily use ffor provide decription for a class for field 