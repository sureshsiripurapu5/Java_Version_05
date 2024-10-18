import java.io.*;

class InputClass
{
	void myOldInputMethod() throws IOException
	{
		DataInputStream disObj=new DataInputStream(System.in);

        System.out.print("Enter an integer?"); 
        int n=0;
        n=disObj.readInt();
     
        System.out.print("You have given:"+n); 
    }
}	
		
class EHP02CheckedInputDataVer5
{
  public static void main(String args[])
  {
    InputClass   inpObj=new InputClass();
	             inpObj.myOldInputMethod();
  }
}

//scroll DOWN

//THIS IS SOLUTION-2 Method-2 to skip CE
            



     





