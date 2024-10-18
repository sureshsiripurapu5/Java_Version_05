class A 
{
	void display()
	{
	  System.out.println("Good Morning");
	}
	void show()
	{
	  System.out.println("Hello,How are You?");
	}	
}
class B extends A 
{
	void show()
	{
      display();
	  super.display();   
	  System.out.println("Hi,Dude..WhatsUp!!");
	}
}
class SuperUsage1P02TestMethodOverridingVer2 
{
	public static void main(String args[])
	{
		B  bObj=new B();
		   bObj.show();
	}
}