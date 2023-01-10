class D
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		System.out.println(sb.length());
		System.out.println(sb.capacity());//default capacity is 16
		//this method is only availabe only for the stringBuffer and StringBuilder methods not for string method
	}
}

