class SuperClass
{
  void	showMethod()
        {
          System.out.println("SuperClass-->showMethod executed");		
	    } 
}
class SubClass 
{
  
	  	
}
class InheritanceP01ApplcnSingleVer2
{
	public static void main(String args[])
	{
		SubClass   subObj=new SubClass();  // recommended
	               subObj.showMethod();
	}
}  // SCROLL DOWN







/*
After COMPILATION:
D:\MyJavaProgs>javac InheritanceP01ApplcnSingleVer2.java
InheritanceP01ApplcnSingleVer2.java:18: cannot find symbol
symbol  : method showMethod()
location: class SubClass
                       subObj.showMethod();
                             ^




*/