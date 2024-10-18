class A
{
	int x;
	
	    A(int y)
		{
			this  ();  // first statement
			x=y;  
			System.out.println("x="+x);
			//this    ();  // def constructor call
		}
		A()
		{
			System.out.println("UserDefined Def Constructor Executed");
		}
}
class THISP02AsConstructorVer2
{
	public static void main(String args[])
	{
		A aObj=new A(1);
	
	}
}