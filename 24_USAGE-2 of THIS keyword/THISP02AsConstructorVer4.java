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
class THISP02AsConstructorVer4
{
	public static void main(String args[])
	{
		  this(1); 
		A aObj=new A();
		  this(2);  
		  //aObj.this();
	}
}