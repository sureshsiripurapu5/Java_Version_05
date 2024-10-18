class Greet
{
    void somebody()                               //overridden method
	     {
           System.out.println("Hello Friend !!!"); 
         }
}
class Wish extends Greet
{
    // preference  to execute our sub class' method only
    void somebody()                                // overriding method
         {
           System.out.println("Hi Dude !!!"); 

         }
  
}

class OverridingP03MethodOverridingVer1
{
    public static void main(String args[])
    {
        Wish say=new Wish();
             say.somebody();
                                 
    }
}