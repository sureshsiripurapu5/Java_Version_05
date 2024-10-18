class ExceptionHandlingP02WhichERRORVer9
{
    public static void main( String[] args)
    {
	  System.out.println(5);
	  System.out.println(2); 
	  try   // BLOCK
	  {
	   System.out.println(5/0); // skipped to throw at COMMAND PROMPT 
	  }
	  //System.out.println("error LINE is skipped");
	  // classname must be conventionally correct
	  catch(ArithmeticException  errorObjRef)
	  {
		  
	  }
	      // NOW JVM continued to execute the following...
	  System.out.println("Program"); 
	  System.out.println("Execution Ends");  
	  
	  
	}                
}
