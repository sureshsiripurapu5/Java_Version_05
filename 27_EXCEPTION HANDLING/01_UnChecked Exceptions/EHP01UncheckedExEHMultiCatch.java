class EHP01UncheckedExEHMultiCatch
{
  public static void main(String clArgs[]) 
  {
    try 
    {
       int n = clArgs.length;
       System.out.println("No. of Arguments :  " + n);
       int q = 5 / n;  //error if no args passed bcz n=0
      
       int array[] = { 100,200,800 };  //these are neglected if above is error
       array[3] = 300;
              
     } 
    catch(ArithmeticException aeObjRef) 
    {
      System.out.println("Divide by 0: " );
    }
 
    catch(ArrayIndexOutOfBoundsException aiObjRef) 
    {
      System.out.println("\n\nArray index crossed Boundary: " + aiObjRef);
    }

 System.out.println("Reached After try/catch blocks.");
 }
}