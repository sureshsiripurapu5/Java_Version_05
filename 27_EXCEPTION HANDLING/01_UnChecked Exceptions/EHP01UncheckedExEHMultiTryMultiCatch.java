class EHP01UncheckedExEHMultiTryMultiCatch
{
  public static void main(String args[]) 
  {
    try 
    {
       int n = args.length;
       System.out.println("No. of Arguments :  " + n);
       int q = 5 / n;  //error cause if no args passed bcz n=0
    } 
    catch(ArithmeticException   ObjRef) 
    {
      System.out.println("AE exception caught " );
    } 
   try
   {
       int array[] = { 100,200,800 };  //these are neglected if above is error
       array[3] = 300; //error cause
   }
   catch(ArrayIndexOutOfBoundsException  ObjRef) 
   {
      System.out.println("OOBAI exception caught " );
   }
    

 System.out.println("Reached After try/catch blocks.");
 System.out.println("Reached After try/catch blocks.");
 System.out.println("Reached After try/catch blocks.");
 }
}