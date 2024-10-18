class A
{
                          int  defField;  // default access behaviour
      public         int  pubField;
      private        int  pvtField;
      protected   int  protField;
 }
class B extends A        // sub class 
{
    // Assume those 4 fields are inherited (But Only 3 inherited/accessed)
    void   testAccess()  // test sub class accessibility
              {
                   defField=1;          //OK for default
                  pubField=2;          //OK  for public 
                  protField=3;         //OK  for protected
                  pvtField=4;           //Not OK  for private // ERROR
              }

}
class Prog3SubClassAccess 
{
   public static void main(String args[])
   {
      B bObj = new B();     //  Always choose sub class object
         bObj.testAccess();
   }
}
            



     





