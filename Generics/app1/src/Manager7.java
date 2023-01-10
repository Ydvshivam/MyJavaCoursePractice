class G <X>
{
	X i;
	G(X i, int j)
	{
		this.i = i;
	}
}
class Manager7
{
	public static void main(String[] args)
	{
		G<String> g1 = new G<String>("abc", 10);
		G<Integer> g2 = new G<Integer>(20,40);
		G<Boolean> g3 = new G<Boolean>(true,60);

		System.out.println("done");
	}
}
 