class A 
{
	void show(int x)
	{
	  System.out.println("Hello,How are You?");
	}	
}
class B extends A 
{
	void show(int y)
	{
      super.show(2);
	  System.out.println("Hi,Dude..WhatsUp!!");
	  
	}
}
class SuperUsage1P02TestMethodOverridingVer1 
{
	public static void main(String args[])
	{
		B  bObj=new B();
		   bObj.show(1);
	}
}