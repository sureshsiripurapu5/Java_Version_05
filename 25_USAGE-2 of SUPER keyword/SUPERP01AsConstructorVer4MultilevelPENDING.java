class A 
{
	A(int x)
	{
	  System.out.println("SuperClass-->Parameterised constructor Executed");
	}
	A()
	{
	  System.out.println("SuperClass-->Default constructor Executed");
	}	
}

class A // change B
{
	A(int x)
	{
	  System.out.println("SuperClass-->Parameterised constructor Executed");
	}
	A()
	{
	  System.out.println("SuperClass-->Default constructor Executed");
	}	
}
class B extends A  // change as C
{
	B(int y)  
    { 
	  super();   // NOT NECESSARY 
	  System.out.println("Sub Class--> Param constructor Executed");
	}
	
	B()  
    { 
	  System.out.println("Sub Class--> constructor Executed");
	}
}
class SUPERP01AsConstructorVer4Multilevel
{
	public static void main(String args[])
	{
		B  bObj=new B(1);
	}
}