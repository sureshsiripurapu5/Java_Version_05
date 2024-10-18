import java.io.DataInputStream;

class EHP02CheckedInputDataVer1
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
            



     





