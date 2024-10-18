abstract class A
                 {
                      void greet()
                      {
                        System.out.println("Hi Goodmorning");
                       }
                 }
class B extends A   
{
    
}
class ExAbstractClass
{
   public static void main(String[] args)
   {
       // A aObj=new A(); //ERROR
        //   aObj.greet(); //NOT POSSIBLE
         B bObj=new B();
           bObj.greet();
   }
}   