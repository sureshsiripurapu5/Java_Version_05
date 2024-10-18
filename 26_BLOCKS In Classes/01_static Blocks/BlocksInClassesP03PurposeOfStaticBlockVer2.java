class A
{
  static int a;	
    static   
    {
      a=1; //  static variable
	  System.out.println("a="+a);
    } 	
}
class BlocksInClassesP03PurposeOfStaticBlockVer2
{
    public static void main(String[] args)
    {
	  A aObjRef=new A(); // NOW only A.class is LOADED in JVM
	}
	
}
