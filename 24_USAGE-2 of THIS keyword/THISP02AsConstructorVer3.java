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
			this(1);
			System.out.println("UserDefined Def Constructor Executed");
			//this(1);   // Parameterised constructor call
		}
}
class THISP02AsConstructorVer3
{
	public static void main(String args[])
	{
		A aObj=new A();
		
	}
}