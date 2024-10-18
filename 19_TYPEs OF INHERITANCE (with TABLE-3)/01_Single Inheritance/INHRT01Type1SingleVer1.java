class A
{
       int a;           //  field:default access	
	   void showOfA()   // method:default access
	   {
	     System.out.println("A-->showOfA() Accessed");
	   }		 
}
class B extends A
{
        int b;	 //default access
      void showOfB()   // method:default access
	   {
	     System.out.println("B-->showOfB() Accessed");
	   }
}
class INHRT01Type1SingleVer1
{
	public static void main(String args[])
	{
	  B  bObj=new B();
         bObj.b=2;	
         System.out.println("b="+bObj.b);
          bObj.a=1;	 // other class'member and bcz of default access
         System.out.println("a="+bObj.a);
		 bObj.showOfB();
		 bObj.showOfA();
	}
}