class BlocksInClassesP01NonstaticAndStaticVer1
{
        public static void main(String args[])
        {
          System.out.println("EXECUTED : main() Method ");
        }
 
        static
        {
          System.out.println("EXECUTED : static Block of Same class ");
        }                  
                     
        {
          System.out.println("EXECUTED : Non-static Block of Same class");
        }
    
}  // SCROLL DOWN









/*

 Non-static  Block -NOT EXECUTED bcz no object/constructor
 
 
*/