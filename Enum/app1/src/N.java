enum Month
{
	JAN, FAB, MAR, APR, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}

class N 
{
	public static void main(String[] args) 
	{
		Month[] all1 = Month.values();

		for(Month all2 : all1)
		{
		System.out.println(all2);	
		}
		System.out.println("______________________");

		for(Month all3 : Month.values())
		{
			System.out.println(all3);
		}
		System.out.println("______________________");

		for(int i = 0; i< all1.length; i++)
		{
			System.out.println(all2);
		}System.out.println("______________________");


	}
}
