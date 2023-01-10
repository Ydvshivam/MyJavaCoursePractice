class M4
{
	public static void main(String[] args)
	{
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}//in string method we will get same hashCode if values are same there is same hello in both string