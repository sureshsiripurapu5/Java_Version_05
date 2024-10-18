class EHP01UncheckedDemoEHandlerSuperSub
{
    public static void main(String args[]) 
    {
	try 
	{
	  int b = 4 / 0;
	} 
	catch(Throwable e) 
	{
	   System.out.println(" Exception catched");
	}
	catch(ArithmeticException e) 
	{ 
	   System.out.println("ArithmeticException catched");
	}
   }
}