class A
{
      void  wishFaculty( )                
            { 
               System.out.println("Good Morning Sir !");
            }
}
class B          // independent class
{
      void  wishFaculty( )               
            {
               System.out.println("Hi Sir !!");
            }
}
class OverridingP01DemoProgramVer2
{
    public static void main(String args[])
    {
        A aObj = new  A();
          aObj.wishFaculty();
        B bObj = new  B();
          bObj.wishFaculty();
    }
}
            



     





