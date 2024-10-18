class FirstExWithMainWithoutExitMethodCheckOrderJ2SE8 
{
   public static void main(String args[])
   {
     System.out.println("This is Java 1.8's main()");
   }
  
   static
   {
     System.out.println("This is Java 1.8 without main()");
      
      //System.exit(2);
   } 
}