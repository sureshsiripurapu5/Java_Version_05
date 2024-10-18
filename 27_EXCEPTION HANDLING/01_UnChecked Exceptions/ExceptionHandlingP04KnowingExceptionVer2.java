class ExceptionHandlingP04KnowingExceptionVer2
{
    public static void main( String[] args)
    {
	  int[] arr={10,20,30};
	  try
	  {
	   System.out.println(arr[3]); // if u write -1 or 4 also ERROR
	  }
	  catch(ArrayIndexOutOfBoundsException aioobe){}
	  
	  System.out.println("Program ends HERE");  
	}                
}
