class S extends Thread
{
	S()
	{
		start();
	}
	@Override
	public void run()
	{
		System.out.println("run begin");
		System.out.println("run begin");
	}
}
class T
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		S s1= new S();
		System.out.println("main end");
	}
}
/*
AutoStart in multithread 
Through the contructor of child class we ccan start the thread that is called autostart.

