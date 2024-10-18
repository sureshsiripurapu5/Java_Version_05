class A
{
		A()
		{
		   System.out.println("A class-->A() invoked");
		}
   void methodInTheSameClass()
		{
			this();
		}	
		
}
class THISP02AsConstructorVer8
{
	public static void main(String args[])
	{
		A aObj=new A();
		  aObj.methodInTheSameClass();
	}
}