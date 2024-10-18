class A
{
    {
      System.out.println("EXECUTED : NON-static Block");
    } 	
}
class BlocksInClassesP02NonStaticBlocksVer3
{
    public static void main(String[] args)
    {
	  System.out.println("EXECUTED : main() method"); 
	  A aObjRef=new A(); // NOW only A.class is LOADED in JVM
	}
	
}
