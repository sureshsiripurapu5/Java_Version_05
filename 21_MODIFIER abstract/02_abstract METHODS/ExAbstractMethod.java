abstract class A
                 {
                    abstract void greet(); //decaration
                      
                 }
class B extends A
{
        void wish() 
                 {
                     System.out.println("Hi Dude");
                 }
 }
class ExAbstractMethod
{
   public static void main(String[] args)
   {
                   
         B bObj=new B();
             bObj.greet();
   }
}   