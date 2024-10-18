final   class X
        {
	        void showMessage()
			{
				System.out.println("C is not Confusion but TOUGH");
	        }
        }

final   class A extends X
        {
	        void showMessage()
			{
				super.showMessage();
				System.out.println("Java is a confusioin,but Easy");
	        }
        }
class FinalClassP01ToShowBehaviourVer7
{
   public static void main(String[] args)
   {
	    A   aObjRef=new A();
	        aObjRef.showMessage();   
		X   xObjRef=new A();
	        xObjRef.showMessage();     
   }

}