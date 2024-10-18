class A
{
   final void myMethod()  
   {
    System.out.println("Hi, friend, How do you do?");	   
   }	
}
class B extends A
{
   void myMethod()  
   {
    System.out.println("Hi Bro, What's Up?");	   
   }	
}
class FinalMethodP01ToShowBehaviourVer2
{
    public static void main(String[] args)
    {
	   B bSubObjRef=new B();
	     bSubObjRef.myMethod();
	   
    }
}