class P extends Thread
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
			try
			{
				sleep(10000);
				Thread.currentThread().interrupt();//to get a referace to current thread
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("main end");
	}
}
