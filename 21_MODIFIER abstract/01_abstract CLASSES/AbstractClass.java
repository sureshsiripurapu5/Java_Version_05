abstract class A
{
      abstract void display();  // my method
      
    void show()  // non-abstract method
         {
          System.out.println("Hi2");
         }
                  
 
}
class B extends A
{
     void display()  // my method
          {
            System.out.println("Hello1");
          } 
    void show()  //overriding method
         {
           System.out.println("Hello2");
         }      
     

}
class AbstractClass
{
  public static void main(String args[])
  {
        
        A aObj=new A();
          aObj.show();
     
        B bObj=new B();
          bObj.show();
          
  }
}
            



     





