class G
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer(20);
		System.out.println(sb.length());//
		System.out.println(sb.capacity());
		System.out.println("-----------------");
		sb.append("123456789112345678921");
		System.out.println(sb);
		System.out.println(sb.length());
		//(oldcapacity *2) + 2
		System.out.println(sb.capacity());//(16*2)=32 +2 +34;
		System.out.println(sb);
	}
}

