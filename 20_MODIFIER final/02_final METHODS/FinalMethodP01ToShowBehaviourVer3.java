class A
{
  final void myMethod()  
         {
           System.out.println("Hi, friend, How do you do?");	   
         }	
}
class B extends A
{
        void myMethOd()  
        {
          System.out.println("Hi Bro, What's Up?");	   
        }	
}
class FinalMethodP01ToShowBehaviourVer3
{
    public static void main(String[] args)
    {
	   B bSubObjRef=new B();
	     bSubObjRef.myMethod();
	   
    }
} // see below








// o is CAPITAL observe CARE FULLY