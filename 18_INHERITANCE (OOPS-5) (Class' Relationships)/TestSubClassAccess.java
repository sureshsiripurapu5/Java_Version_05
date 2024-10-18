class A
{
            int  defaf;
  public    int  pubaf;
  private   int  pvtaf;
  protected int  protaf;
   
   

}
class B extends A
{

    
    void   testAccess()  // test sub class accessibility
           {
               defaf=1;  //OK
               pubaf=2;  //OK
               pvtaf=3;  //Not OK
               protaf=4; //OK
            }

}
class TestSubClassAccess 
{

  public static void main(String args[])
  {
    B bObj = new B();
      bObj.testAccess();
    
    

    
  }
}
            



     





