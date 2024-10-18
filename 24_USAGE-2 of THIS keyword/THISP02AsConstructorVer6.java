class A
{
	int x;
	    A(int y)
		{
		   this();
		   System.out.println("Hi");
			
		}
		A()
		{
			this(1);
			System.out.println("Bye");
		    
		}
}
class THISP02AsConstructorVer6
{
	public static void main(String args[])
	{
		A aObj=new A();
	}
}        // scroll DOWN





// ERROR:
D:\java progs>javac THISP02AsConstructorVer7.java
THISP02AsConstructorVer7.java:3: error: recursive constructor invocation
                A()
                ^
1 error

D:\java progs>javac THISP02AsConstructorVer6.java
THISP02AsConstructorVer6.java:4: error: recursive constructor invocation
            A(int y)
            ^
1 error