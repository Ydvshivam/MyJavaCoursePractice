class I
{
	public static void main(String[] args) 
	{
		//StringBuffer sb = new StringBuffer("shivam");
		String sb = "shivam";
		char[] ch = sb.toCharArray();
		System.out.println(ch.length);

		for (int i = 5;i < ch.length; i--)
		{
			System.out.println(ch[i]);
		}
	}
}

