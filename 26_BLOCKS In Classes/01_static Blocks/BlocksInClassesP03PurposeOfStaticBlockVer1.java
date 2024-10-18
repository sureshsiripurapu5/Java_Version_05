class A
{
  int a;	
    static   
    {
      a=1; // non-static
	  System.out.println("field of Class A="+a);
    } 	
}
class BlocksInClassesP03PurposeOfStaticBlockVer1
{
    public static void main(String[] args)
    {
	  A aObjRef=new A(); // NOW only A.class is LOADED in JVM
	}
	
}
