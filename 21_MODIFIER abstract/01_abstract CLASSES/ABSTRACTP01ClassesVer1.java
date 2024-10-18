abstract class A 
         {
	      int x;
	
	      void showMsg()
	      {
			 System.out.println("Super Class");
	      }
	
}
class ABSTRACTP01ClassesVer1
{
	public static void main(String args[])
	{
	 A aObj=new A(); 
	   aObj.x=1;
	   aObj.showMsg();
	}
}            // scroll DOWN


/*
D:\JavaProgs>JAVAC ABSTRACTP01ClassesVer1.java
ABSTRACTP01ClassesVer1.java:15: error: A is abstract; cannot be instantiated
         A aObj=new A();
                ^
1 error
*/
