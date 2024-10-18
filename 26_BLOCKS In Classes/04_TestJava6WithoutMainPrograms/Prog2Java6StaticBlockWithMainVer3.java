class Prog2Java6StaticBlockWithMainVer3
{
     static
     {
       System.out.println("Hello User : I am static block of Java 1.6");
      }
         // JVM Searches for main() method after execution of static Block
    public static void main( String[ ]   args )  
    {
        System.out.println("Hello User : I am main() of Java 1.6");
    }


}