class A 
{
    String name;
    int rollno;
	double salary;

    A(String inname, int inroll, double insalary) //intialize
    {
        this.name = inname;
        this.rollno = inroll;
        this.salary = insalary;
    }
	//overriding
	public String toString()
	{
		//return className@hashcode in the form of hexadeciaml (default)
		return name + " " + rollno + " " + salary;
	}
}
class B 
{
    public static void main(String[] args)
    {
        A a1 = new A("shivam", 101, 20000.2);
        A a2 = new A("shiva", 102, 15000.5);
		System.out.println(a1);
		System.out.println(a2);

    }
}
