class BlocksInClassesP02NonstaticInsideStatic
{
    public static void main(String args[])
    {
      System.out.println("EXECUTED : main() Method ");
    }
 
    static            // static  Block   
    {
      System.out.println("EXECUTED : static Block  of Same class ");
          
        {            // Non-static  Block   
          System.out.println("EXECUTED : Non-static Block inside static Block");
        }
    }
}