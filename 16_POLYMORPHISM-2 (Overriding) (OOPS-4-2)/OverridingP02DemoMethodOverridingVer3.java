class A
{
  void  wishFaculty()                // overRidden method
        { 
           System.out.println("Good Morning Sir !");
        }
}
class B  extends A
{
   int count;
   void wishFaculty()                  // overRiding method
        {           
 		    System.out.println(++count + "Hi Sir !!");
            wishFaculty();  // wish to call Super class's method like this?
        }
    // class A's  wishFaculty() method ALSO inherited here
}
class OverridingP02DemoMethodOverridingVer3
{
    public static void main(String args[])
    {
        B bObj = new B();
          bObj.wishFaculty();
    }
}
            



     





