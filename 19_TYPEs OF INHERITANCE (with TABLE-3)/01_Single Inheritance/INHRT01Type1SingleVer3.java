class A
{
    private int  a;        //  field:default access	
	public  void showOfA()   // method:default access
	        {
		      a=1;
			  System.out.println("private a="+a);
	          System.out.println("A-->showOfA() Accessed");
	        }		 
}
class B extends A
{
    private int b;	 //default access
    public void showOfB()   // method:default access
	        {
	          System.out.println("B-->showOfB() Accessed");
		      //System.out.println("a="+a);
		       System.out.println("b="+b);
			   showOfA();
	         }
		
}
class INHRT01Type1SingleVer3
{
	public static void main(String args[])
	{
	  B  bObj=new B();
          bObj.showOfB();
		
	}
}