import java.util.Scanner;
class MarksOutOfMaxException extends Exception 
{
         MarksOutOfMaxException(String msg) 
         {
          super(msg);
         }
}
class EHP01UserDefinedTotalMarksInSSCVer2
{
    public static void main(String args[]) 
    {
        Scanner scObj=new Scanner(System.in);  
        System.out.print("\n\n Please Input Total Marks in 10th Class ? ");
        int tot=scObj.nextInt();
         
          if (tot>600)
             throw new MarksOutOfMaxException("Max Marks exceeded! Check Once...");
          System.out.println("\n Hi ! \n Your Total Marks =  " + tot);
        
          System.out.println("\n\nReached finally");
       
   }
}