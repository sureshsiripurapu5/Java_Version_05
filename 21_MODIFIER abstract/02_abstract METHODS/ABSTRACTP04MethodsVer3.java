abstract class A 
{
	
  abstract void showMsg();
				
	
}
class B extends A 
{
          void showMsg()
	       {
	         System.out.println("A-->Msg Hi,Bro");
	       }
}	
class ABSTRACTP04MethodsVer3
{
	public static void main(String args[])
	{
	 B bObj=new B();
	   
	   bObj.showMsg();
	}
}