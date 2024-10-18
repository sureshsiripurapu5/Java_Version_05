class Prog2Java6StaticBlockWithMainVer2
{
     static
     {
       System.out.println("Hello User : I am static block of Java 1.6");
      }
         // JVM Searches for main() method after execution of static Block
    public static void main( )  // not recognized as main() method  REQUIRED by Java
    {
        System.out.println("Hello User : I am main() of Java 1.6");
    }


}