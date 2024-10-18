class Greet
{ 
    void message()                               
	     {
           System.out.println("Read Text books for wisdom"); 
         }
}
class Wish extends Greet
{
     
	int message()                               
	     {
           System.out.println("Read All books for wisdom");
		   
         }
}
class OverridingP05TestMethodOverridingWithReturnTypesVer1 
{
      public static void main(String args[])
      {
        Wish give=new Wish();
             give.message();
                                 
      }
}