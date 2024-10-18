import java.io.DataInputStream;

class EHP02CheckedInputDataVer0
{
  public static void main(String args[])
  {
    DataInputStream disObj=new DataInputStream(System.in);

    System.out.print("Enter an integer?"); 
    int n=0;
       
     n=disObj.readInt();
 
    System.out.print("You have given:"+n); 
    
  }
}
            



     





