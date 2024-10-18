class A
{
    {
      System.out.println("EXECUTED : NON-static Block-1");
    } 
	{
      System.out.println("EXECUTED : NON-static Block-2");
    }
}
class BlocksInClassesP02NonStaticBlocksVer4
{
    public static void main(String[] args)
    {
	  System.out.println("EXECUTED : main() method");
	  A aObjRef=new A(); // NOW only A.class is LOADED in JVM
	}
	
}
