import java.util.*;
class ExEH5
{
    public static void main(String args[])  //throws Exception
    {  
       
        int num=0,den=3;  
       Scanner scnObj = new Scanner(System.in);
       try
        {        
         System.out.println("enter numerator?");
         num=scnObj.nextInt();
       }
       catch(Exception e)
        {
        }      
        try
        {
        System.out.println("enter denominator?");
         den=scnObj.nextInt();
        }
        catch(InputMismatchException E)
        {
        }           
       int res=0;
         
         res= num/den; 
        
        
      
     System.out.println("result= "+res);
    System.out.println("hello");
    System.out.println("hello");
    System.out.println("hello");
    System.out.println("hello");
    System.out.println("hello");
    System.out.println("hello");

    }
}