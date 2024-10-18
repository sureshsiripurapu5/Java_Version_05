abstract class A
{
  
    abstract  void show();
                  
 
}



class B extends A
{
     void display()  // my method
          {
            System.out.println("Hi");
          } 
   void show()  //overriding method
         {
           System.out.println("Hello");
         }      
     

}

class AbstractMethod
{
  public static void main(String args[])
  {
             
        B bObj=new B();
          bObj.show();
          
          
  }
}
            



     





