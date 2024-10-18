abstract class A
                 {
                    abstract void greet(); //decaration
                      
                 }

                class B   extends A
                {
                      void greet() 
                              {
                                System.out.println("Hi Dude");
                              }
                }

class ExAbstractMethodVer2
{
   public static void main(String[] args)
   {
                   
         B bObj=new B();
             bObj.greet();
   }
}   