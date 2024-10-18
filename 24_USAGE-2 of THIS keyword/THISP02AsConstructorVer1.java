class A
{
	int x;
	
	    A(int y)
		{
			x=y;  
			System.out.println("x="+x);
		}
		A()
		{
			System.out.println("UserDefined Def Constructor Executed");
		}
}
class THISP02AsConstructorVer1
{
	public static void main(String args[])
	{
		A aObj1=new A(1);
		A aObj2=new A();
	}
}