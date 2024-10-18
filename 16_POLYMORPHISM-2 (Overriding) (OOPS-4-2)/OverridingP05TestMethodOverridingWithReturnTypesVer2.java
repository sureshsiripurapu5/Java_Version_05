class Greet
{ 
    int message()                               
	    {
           System.out.println("Read Text books for wisdom"); 
          return 0;
		}
}
class Wish extends Greet
{
     
	int message()                               
	    {
           System.out.println("Read All the books for wisdom");
	     return 0;
	    }
}
class OverridingP05TestMethodOverridingWithReturnTypesVer2 
{
      public static void main(String args[])
      {
        Wish give=new Wish();
             give.message();
                                 
      }
}