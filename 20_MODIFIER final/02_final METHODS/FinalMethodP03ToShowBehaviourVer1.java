class A
{
          final   void show()
                  {
                    System.out.println("Hello");
                    
                  }
}
class B extends A
{
            void show(int a)  // ERROR can not  override bcz it is final
                 {
                  System.out.println("BYE");
                 }
}
class FinalMethodP03ToShowBehaviourVer1
{
  public static void main(String args[])
  {
             
        B bObj=new B();
          bObj.show(2);
   }
}
            



     





