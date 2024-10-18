class Prog2Java6StaticBlockWithMainVer1
{
     static
     {
       System.out.println("Hello User : I am static block of Java 1.6");
       System.exit(2) ;  // exit() is pre-defined static method  
     }
         // JVM Searches for main() method after execution of static Block
    public static void main( )  // not reached HERE bcz JVM exits
    {
        System.out.println("Hello User : I am main() of Java 1.6");
    }


}