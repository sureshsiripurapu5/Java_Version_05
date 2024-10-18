abstract class A 
         {
	      int x;
	
	      void showMsg()
	      {
			 System.out.println("x="+x); 
			 System.out.println("Super Class");
	      }
	
}
class B extends A
{
          void showMsg()
	      {
			 x=2;
			 System.out.println("x="+x); 
			 System.out.println("Sub Class");
	      }
   
}	
class ABSTRACTP01ClassesVer3
{
	public static void main(String args[])
	{
	 B bObj=new B();
	   bObj.x=1;
	   bObj.showMsg();
	}
}