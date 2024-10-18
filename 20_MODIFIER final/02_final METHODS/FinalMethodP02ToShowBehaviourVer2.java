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
      void storeShow()
	  {
	    x=2;
	    System.out.println("B-->x="+x+" from storeShow() method");
	  }
	
      void showMsg()
	  {
	   System.out.println("B-->Msg from showMsg() method");
	  }	
	
}	
class FinalMethodP02ToShowBehaviourVer2
{
	public static void main(String args[])
	{
	 B bObj=new B();
	   bObj.storeShow();
	   //bObj.showMsg();
	}
}