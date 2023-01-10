@interface N
{
int version() default 1;
String author() default "shiva";
}
@N(author = "abc")
class O
{
	@N
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
//maily use ffor provide decription for a class for field 