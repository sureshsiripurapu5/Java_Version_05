class ExceptionHandlingP02WhichERRORVer6
{
    public static void main( String[] args)
    {
	  System.out.println(5);
	  System.out.println(2);
	  try   // BLOCK
	  {
	   System.out.println(5/0); // Runtime ERROR causing Statement 
	  }
	  finally
	  {
		System.out.println("Program"); 
	    System.out.println("Execution Ends");  
	  }
	  
	}                
}
