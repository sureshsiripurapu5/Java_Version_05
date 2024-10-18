class Prog2Java6StaticBlockWithMainVer5
{
    static   // executed 1st
     {
       System.out.println("Hello User : I am static block-2 of Java 1.6");
      }
    public  static void main( String[ ]   args )   // executes 3rd in this CASE 
    {
        System.out.println("Hello User : I am main() of Java 1.6");
    }
     static  // executes 2nd
     {
       System.out.println("Hello User : I am static block-1 of Java 1.6");
      }
          
 }