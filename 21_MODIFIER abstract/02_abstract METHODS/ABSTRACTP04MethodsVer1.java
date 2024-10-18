class A 
{
	
  abstract void showMsg()
				{
				   System.out.println("A-->Msg Hello , friend");	
	            }
	
}
class B extends A 
{
          void showMsg()
	       {
	         System.out.println("A-->Msg Hi,Bro");
	       }
}	
class ABSTRACTP04MethodsVer1
{
	public static void main(String args[])
	{
	 B bObj=new B();
	   
	   bObj.showMsg();
	}
}