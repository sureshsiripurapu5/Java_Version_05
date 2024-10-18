abstract class A
                 {
                    abstract void greet(); //decaration
                      
                 }

                class B  
                {
                      void greet() 
                              {
                                System.out.println("Hi Dude");
                              }
                }

class ExAbstractMethodVer3
{
   public static void main(String[] args)
   {
                   
         B bObj=new B();
             bObj.greet();
   }
}   