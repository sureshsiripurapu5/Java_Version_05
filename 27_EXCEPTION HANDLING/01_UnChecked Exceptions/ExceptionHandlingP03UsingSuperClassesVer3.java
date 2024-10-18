class ExceptionHandlingP03UsingSuperClassesVer3
{
    public static void main( String[] args)
    {
	  System.out.println(5);
	  System.out.println(2); 
	  try    
	  {
	   System.out.println(5/0); // skipped to throw at COMMAND PROMPT 
	  }
	  catch(Exception  x) // superclass Type
	  {
		  
	  }
	      // NOW JVM continued to execute the following...
	  System.out.println("Program"); 
	  System.out.println("Execution Ends");  
	  
	  
	}                
}
