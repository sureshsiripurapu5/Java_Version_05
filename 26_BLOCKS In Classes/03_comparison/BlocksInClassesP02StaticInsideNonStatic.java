class BlocksInClassesP02StaticInsideNonStatic
{
    public static void main(String args[])
    {
      System.out.println("EXECUTED : main() Method ");
    }
                  
    {            // non-static Block
     System.out.println("EXECUTED : Non-static Block  iof Same class ");
        static   // static  Block 
        {
           System.out.println("EXECUTED : static Block inside Non-static);
        }       
    }
}