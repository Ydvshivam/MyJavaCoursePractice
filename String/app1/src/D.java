class D
{
	public static void main(String [] args)
	{
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1.equlas(s2));

		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s3.equlas(s4));

	}
}
// in string class .equal method of string class got overrided to check for the conataint of two objects rather than memory locations