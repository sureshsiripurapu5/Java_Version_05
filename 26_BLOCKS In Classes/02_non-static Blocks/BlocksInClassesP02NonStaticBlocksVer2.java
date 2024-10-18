class A
{
    {
      System.out.println("EXECUTED : static Block");
    } 	
}
class BlocksInClassesP02NonStaticBlocksVer2
{
    public static void main(String[] args)
    {
	  System.out.println("EXECUTED : main() method"); 
	  A aObjRef; //NOW A.class is NOT LOADED in JVM
	}
	
}
