@interface F
{
int someDesc();
}
@F(someDesc = 100)
class G
{
	@F(someDesc=20)
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
//maily use ffor provide decription for a class for field 