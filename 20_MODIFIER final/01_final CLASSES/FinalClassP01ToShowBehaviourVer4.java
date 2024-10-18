final   class X
        {
	        void showMessage()
			{
				System.out.println("C is not Confusion but TOUGH");
	        }
        }
final   class A
        {
	        void showMessage()
			{
				System.out.println("Java is a confusioin,but Easy");
	        }
        }
class B  
{
	
	
}
class FinalClassP01ToShowBehaviourVer4
{
   public static void main(String[] args)
   {
	    A   aObjRef=new A();
	        aObjRef.showMessage();   
		X   xObjRef=new X();
	        xObjRef.showMessage();   
   }

}