class A
{
    void  wishFaculty( )     // overRIDDEN method
          { 
             System.out.println("Good Morning Sir !");
          }
}
class B  extends A         // but dependent class on A i.e.,Inheritance applied
{
      void  wishFaculty( )   // overRIDING method
            {
               System.out.println("Hi Sir !!");
            }
   // class A's  wishFaculty( ) method is also inherited here
}
class OverridingP02DemoMethodOverridingVer1
{
    public static void main(String args[])
    {
        B  bObj = new  B();       // Now bObj has TWO versions of wishFaculty()  
           bObj.wishFaculty();    // which method is EXECUTED????
    
     }
}
            



     





