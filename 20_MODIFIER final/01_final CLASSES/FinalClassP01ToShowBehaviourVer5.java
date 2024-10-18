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
				System.out.println("Java is a confusioin,but Easy");
	        }
        }
class B //extends A	
{
	
	
}
class FinalClassP01ToShowBehaviourVer5
{
   public static void main(String[] args)
   {
	    A   aObjRef=new A();
	        aObjRef.showMessage();  // only possibility
		X   xObjRef=new A();
	        xObjRef.showMessage();  // only possibility   
   }

}