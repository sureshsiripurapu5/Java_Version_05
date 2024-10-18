import java.io.DataInputStream;
import java.io.IOException;

class EHP02CheckedInputDataVer2
{
  public static void main(String args[])
  {
    DataInputStream disObj=new DataInputStream(System.in);

    System.out.print("Enter an integer?"); 
    int n=0;
     try
     {  
     n=disObj.readInt();
     }
     catch(IOException e)
     {
     }
    System.out.print("You have given:"+n); 
    
  }
}

//scroll DOWN

//THIS IS SOLUTION-1 to skip CE
            



     





