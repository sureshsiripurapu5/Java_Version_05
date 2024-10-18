abstract class A 
{
	
  abstract void showMsg();
				
	
}
abstract  class B extends A 
{
          
}
class C extends B
{
        int showMsg()
		{
			System.out.println("Hi Bro");
			return 0;
        }
}	
class ABSTRACTP04MethodsVer4
{
	public static void main(String args[])
	{
	 C cObj=new C();
	   
	   cObj.showMsg();
	}
}