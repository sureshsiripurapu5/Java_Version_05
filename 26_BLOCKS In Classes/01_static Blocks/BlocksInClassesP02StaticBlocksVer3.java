class A
{
    static   
    {
      System.out.println("EXECUTED : static Block");
    } 	
}
class BlocksInClassesP02StaticBlocksVer3
{
    public static void main(String[] args)
    {
	  System.out.println("EXECUTED : main() method"); 
	  A aObjRef=new A(); // NOW only A.class is LOADED in JVM
	}
	
}
