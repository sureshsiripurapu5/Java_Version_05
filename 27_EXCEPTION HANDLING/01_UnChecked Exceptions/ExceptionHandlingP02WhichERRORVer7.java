class ExceptionHandlingP02WhichERRORVer7
{
    public static void main( String[] args)
    {
	  System.out.println(5);
	  System.out.println(2);
	  try   // BLOCK
	  {
	   System.out.println(5/0); // Runtime ERROR causing Statement 
	  }
	  catch(arithmeticexception  errorObjRef)
	  {
		  
	  }
	 
		System.out.println("Program"); 
	    System.out.println("Execution Ends");  
	  
	  
	}                
}
