final   class A
        {
	        void showMessage()
			{
				System.out.println("Java is Easy,but confusion");
	        }
        }
class B //extends A	
{
	
	
}
class FinalClassP01ToShowBehaviourVer3
{
   public static void main(String[] args)
   {
	   A   objRef=new A();
	       objRef.showMessage();  // only possibility
   }

}