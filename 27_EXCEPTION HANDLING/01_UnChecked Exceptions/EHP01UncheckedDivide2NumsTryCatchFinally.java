import java.util.Scanner;
class Divide2NumsTryCatchFinally
{

  public static void main(String args[])
  {
   

   Scanner scnObj=new Scanner(System.in);

    System.out.print("Enter numerator?"); 
    int n=scnObj.nextInt();
    System.out.print("Enter denominator?"); 
    int d=scnObj.nextInt();
    try
    {
    System.out.println("QUOTIENT="+n/d); //eror condition
    }
    catch(ArithmeticException  aeObjRef)
    {
     System.out.println("PLEASE DO NOT GIVE 0 AS SECOND VALUE");
          // throwing programmer defined ERROR MESSAGE    
    }
    finally  // guaranteed to execution
    {
     System.out.println("hai");
     System.out.println("program");
     System.out.println("was completed");
    }
  }
}
            



     





