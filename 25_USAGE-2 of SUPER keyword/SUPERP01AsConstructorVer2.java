class A 
{
	A(int x)
	{
	  System.out.println("SuperClass-->Parameterised constructor Executed");
	}
	A()
	{
	  //super(1);
	  System.out.println("SuperClass-->Default constructor Executed");
	  //super(1);
	}	
}
class B extends A
{
	B()  
    { 
	   super(1);  //By default invokes default constructor of super class
	  
	  System.out.println("Sub Class--> constructor Executed");
	}
}
class SUPERP01AsConstructorVer2
{
	public static void main(String args[])
	{
		B  bObj=new B();
		  
	}
}