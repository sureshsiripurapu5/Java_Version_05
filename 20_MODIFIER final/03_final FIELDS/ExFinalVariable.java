       class A
         {
             final float pi=0.0F;
              void modify()
                      {
                          //pi=3.14156;  //ERROR
                        System.out.println(pi);
                       }
          }
class ExFinalVariable
{
   public static void main(String[] args)
   {
         A aObj=new A();
             aObj.modify();
                
   }
}   