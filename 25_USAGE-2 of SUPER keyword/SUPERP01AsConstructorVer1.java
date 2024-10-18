class A 
{
	A(int x)
	{
	  System.out.println("SuperClass-->Parameterised constructor Executed");
	}
	A()
	{
	  
	  System.out.println("SuperClass-->A() constructor Executed");
	  super(1);
	}	
}
class B extends A
{
	B()  
    { 
	  //Control enters HERE but invokes A() of super class
	  System.out.println("Sub Class-->B() constructor Executed");
	}
}
class SUPERP01AsConstructorVer1
{
	public static void main(String args[])
	{
		B  bObj=new B();
		  
	}
}