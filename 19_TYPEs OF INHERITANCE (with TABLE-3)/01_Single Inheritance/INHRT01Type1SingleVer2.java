class A
{
       int a;        //  field:default access	
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
		 System.out.println("a="+a+"b="+b);
	   }
}
class INHRT01Type1SingleVer2
{
	public static void main(String args[])
	{
	  B  bObj=new B();
         bObj.showOfB();
		 bObj.showOfA();
	}
}