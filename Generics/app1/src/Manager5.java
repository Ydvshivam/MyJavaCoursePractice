class E <A>
{
	A i, j;
	B m, n;
	String p,q;
}
class Manager5
{
	public static void main(String[] args)
	{
		E<String, String> e1 = new E<String, String>();
		E<Integer, String> e2 = new <Integer, String>();
		e1.i = "abc";
		e1.j = "xyz";
		e1.m = "abc";
		e1.n = "xyz";
		e2.p = "abc";
		e1.q = "xyz";

		e1.i = 20;
		e1.j = 40;
		e1.m = "abc";
		e1.n = "xyz";
		e2.p = "abc";
		e1.q = "xyz";
		System.out.prinln("done");
	}
}
///generics are introduced in java jdk 1.5
// Generics are introduced for type safty 