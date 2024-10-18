class Greet
{ 
    public int message()  // public access                             
	           {
                 System.out.println("Read Text books for wisdom"); 
                return 0;
		       }
}
class Wish extends Greet
{
     
	public  int message() // DEFAULT access                              
	       {
             System.out.println("Read All the books for wisdom");
	        return 0;
	       }
}
class OverridingP05TestMethodOverridingWithAccessSpecifiersVer2 
{
      public static void main(String args[])
      {
        Wish give=new Wish();
             give.message();
                                 
      }
}