abstract class A
                 {
                    abstract void greet(); //decaration
                      
                 }
abstract class B extends A
                {
                              void wish() 
                             {
                                System.out.println("Hi Dude");
                              }
 }
class ExAbstractMethodVer1
{
   public static void main(String[] args)
   {
                   
         //B bObj=new B();
            // bObj.greet();
   }
}   