class M6
{
	public static void main(String[] args)
	{
		StringBuilder s1 = new StringBuilder("hello");
		StringBuilder s2 = new StringBuilder("hello");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}		
}
//in StringBuilder method we will get diffeant memory address or hashCode

/*
1. StringBuffer -toString(), equals(), hashcode()
1. StringBuffer -toString()
1. StringBuilder -toString()
*/