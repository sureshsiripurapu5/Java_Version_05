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

}	
class ABSTRACTP01ClassesVer2
{
	public static void main(String args[])
	{
	 B bObj=new B();
	   bObj.x=1;
	   bObj.showMsg();
	}
}