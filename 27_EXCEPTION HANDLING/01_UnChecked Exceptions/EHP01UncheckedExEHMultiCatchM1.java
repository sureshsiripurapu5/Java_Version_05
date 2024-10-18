class ExEHMultiCatchM1
{
  public static void main(String args[]) 
  {
    try 
    {
       int n = args.length;
       System.out.println("No. of Arguments :  " + n);
       int q = 5 / n;  //error cause if no args passed bcz n=0
      
       int array[] = { 100,200,800 };  //these are neglected if above is error
       array[3] = 300; //error cause
              
     } 
    catch(ArithmeticException ObjRef) 
    {
      System.out.println("Divide by 0: " );
    }
    catch(ArrayIndexOutOfBoundsException ObjRef) 
    {
      System.out.println("\n\nArray index crossed Boundary: ");
    }

 System.out.println("Reached After try/catch blocks.");
 System.out.println("Reached After try/catch blocks.");
 System.out.println("Reached After try/catch blocks.");
 }
}