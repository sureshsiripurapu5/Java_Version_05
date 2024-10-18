class Prog9TestMainAsStatic
{
    public static void  main(String args[])   // Now it becomes static method 
    {
          System.out.println("Hello Java");
     }
     // NOTE : Now main() modified as static.
     //  NOW does Java invokes main() method in above case ???
    //Ans : YES, Java invokes as                    <ClassName>.main() 
   //    i.e.,  In above Program as     Prog9TestMainAsStatic.main() internally
}