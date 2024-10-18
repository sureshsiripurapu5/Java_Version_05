class A 
{
	int x;
	
	  void storeShow()
	  {
	    x=1;
	    System.out.println("A-->x="+x+" from storeShow() method");
	  }
	
final void showMsg()
	  {
	    System.out.println("A-->Msg from showMsg() method");
	  }
	
}
class B extends A 
{
	// all the memebers ( 1 field+ 2 Methods) are INHERITed 
	// including final Method
	
}	
class FinalMethodP02ToShowBehaviourVer1
{
	public static void main(String args[])
	{
	 B bObj=new B();
	   bObj.storeShow();
	   bObj.showMsg();
	}
}