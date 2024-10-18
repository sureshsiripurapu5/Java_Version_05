class A
{
	int x;
	    A(int y)
		{
		   System.out.println("Hi");
			this();
		}
		A()
		{
			System.out.println("Bye");
		    this(1);
		}
}
class THISP02AsConstructorVer5
{
	public static void main(String args[])
	{
		A aObj=new A();
	}
}