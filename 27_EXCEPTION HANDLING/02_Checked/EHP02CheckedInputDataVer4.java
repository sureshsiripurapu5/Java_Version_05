import java.io.*;

class InputClass
{
	void myOldInputMethod()
	{
		DataInputStream disObj=new DataInputStream(System.in);

        System.out.print("Enter an integer?"); 
        int n=0;
        n=disObj.readInt();
     
        System.out.print("You have given:"+n); 
    }
}	
		
class EHP02CheckedInputDataVer4
{
  public static void main(String args[])throws IOException
  {
    InputClass   inpObj=new InputClass();
	             inpObj.myOldInputMethod();
  }
}

//scroll DOWN

//THIS IS SOLUTION-2 Method-2 to skip CE
            



     





