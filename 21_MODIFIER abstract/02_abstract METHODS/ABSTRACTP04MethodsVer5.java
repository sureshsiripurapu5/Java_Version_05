abstract class A 
{
	
  abstract void showMsg();
				
	
}
abstract  class B extends A 
{
          
}
class C extends B
{
        void showMsg()
		{
			System.out.println("Hi Bro");
			
        }
}	
class ABSTRACTP04MethodsVer5
{
	public static void main(String args[])
	{
	 C cObj=new C();
	   
	   cObj.showMsg();
	}
}