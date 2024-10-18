class A 
{
    void show()
	{
	  System.out.println("Hello,How are You?");
	}	
}
class B extends A 
{
	void display()
	{
	  super.show();   // show();  //TEST THIS
	  System.out.println("Good Morning");
	  show();
	}
	void show()
	{
      System.out.println("Hi,Dude..WhatsUp!!");
	}
}
class SuperUsage1P02TestMethodOverridingVer3
{
	public static void main(String args[])
	{
		B  bObj=new B();
		   bObj.display();
	}
}