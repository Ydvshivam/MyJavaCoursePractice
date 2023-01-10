class F
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("12346792585252123");
		System.out.println(sb.length());
		//(oldcapacity *2) + 2
		System.out.println(sb.capacity());//(16*2)=32 +2 +34;
	}
}

