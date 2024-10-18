class A
{
		A()
		{
			this();
			System.out.println("Bye");
		}
}
class THISP02AsConstructorVer7
{
	public static void main(String args[])
	{
		A aObj=new A();
	}
}