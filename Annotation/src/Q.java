@interface P
{
	int[] version();
}
@P(version = {1,2,3,4})
class Q
{
	@P(version ={1,2,3,4})
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}