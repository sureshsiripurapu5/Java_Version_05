class EHP01UncheckedDemoEHandlerSubSuperCatch 
{
    public static void main(String args[]) 
    {
	try 
	{
	  int b = 4 / 0;
	} 
	catch(ArithmeticException e) 
	{ 
	   System.out.println("ArithmeticException catched");
	}
	catch(Throwable e) 
	{
	   System.out.println(" Exception catched");
	}

   }
}