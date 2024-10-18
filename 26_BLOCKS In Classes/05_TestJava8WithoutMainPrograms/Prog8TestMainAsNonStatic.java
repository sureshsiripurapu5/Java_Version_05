class Prog8TestMainAsNonStatic
{
    public           void  main(String args[])   // Now it becomes non-static method 
    {
          System.out.println("Hello Java");
     }
      // NOTE : Java should invoke main() method thru object ONLY bcz it is non-static
      // BUT does Java knows creation of object by default????
}