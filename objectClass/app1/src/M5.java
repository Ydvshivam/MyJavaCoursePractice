class G
{
	int i;
	public String toString()
	{
		return "This is type of Object with i value as: " + i;
	}
}
class M5
{
	public static void main(String[] args)
	{
		G g1= new G();
		g1.i = 20;
		System.out.println(g1);
		String s1 = "Desc: " + g1;
		System.out.println(s1);
	}
}