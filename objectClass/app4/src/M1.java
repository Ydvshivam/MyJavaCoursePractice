class A
{
	protected void finalize()
	{
		System.out.println("FROM FINALIZE");
	}
}
class M1
{
	public static void main(String[] args)
	{
		A a1 = new A();
		a1 = null;
		System.out.println("program end");

		for(int i =0; i <= 1000; i++ )
		{
			System.out.println(i);s
		}
	}
}
/*if object coantains minimum one referance then it will knnow as live objects.
If there is no referance pointinng to an object that object become abandand object
Once the object become abandond then it is illigible for garbage collection.
Abandand object also called as garbage object.
Once an object become garbagge object in java there is one thread called garbagge collecter.
It is a internal demonthread once in while it will going to a heap memory to check any abandand object is there or not. If there are any abnadand obejts are there it will be callling finallize method on that abandend method, to check after calling a finalize methhod if the object still abandand then it will remove that object from the memory.Demonthread is a thread its life depends on parents tthread life,
Memory mangment is taken care by the garbage collector intenally 
Finalize method is protected or public method.