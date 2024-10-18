class Greet
{ 
    void message()                               
	     {
           System.out.println("Read Text books for wisdom"); 
         }
}
class Wish extends Greet
{
    // message() was inhereited and ASSUME available HERE
	// PREVENT above from EXECUTION
    void message(){ }   // WRITTEN TO OVERRIDE                             

}
class OverridingP04TestMethodOverridingNeedVer2 
{
      public static void main(String args[])
      {
        Wish give=new Wish();
             give.message();
      }
}