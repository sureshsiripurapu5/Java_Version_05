class Prog1Java8StaticBlockWithoutMainVer2
{
     static
     {
       System.out.println("Hello User : I am static block of Java 1.6 without main()");
       System.exit(2) ;  // exit() is pre-defined static method  
     }
      // JVM Searches for main() method after execution of static Block
}