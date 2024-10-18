class SuperClass
{
      void	showMethod()  // ACCESS : default
            {
              System.out.println("SuperClass-->showMethod IS EXECUTED");		
	        } 
}
class SubClass extends SuperClass  
{
                      // assume showMethod() appears HERE
	  	
}
class InheritanceP01ApplcnSingleVer3
{
	public static void main(String args[])
	{
		SubClass   subObj=new SubClass();  // recommended
	               subObj.showMethod();
	}
}